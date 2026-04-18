package com.emergency.emergency_services.controller;

import com.emergency.emergency_services.entity.ServiceRequest;
import com.emergency.emergency_services.repository.ServiceRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ServiceRequestController {

    @Autowired
    private ServiceRequestRepository repo;

    // CREATE REQUEST
    @PostMapping("/request")
    public ServiceRequest createRequest(@RequestBody ServiceRequest request) {
        request.setStatus("PENDING");
        return repo.save(request);
    }

    // GET ALL REQUESTS
    @GetMapping("/requests")
    public List<ServiceRequest> getAllRequests() {
        return repo.findAll();
    }

    // UPDATE STATUS
    @PutMapping("/request/{id}")
    public ServiceRequest updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        ServiceRequest req = repo.findById(id).orElse(null);

        if (req != null) {
            req.setStatus(status);
            return repo.save(req);
        }
        return null;
    }
}