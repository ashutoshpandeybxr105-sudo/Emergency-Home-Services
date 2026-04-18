package com.emergency.emergency_services.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // which user raised request
    private Long userId;

    // type of service (electrician, plumber, doctor, etc.)
    private String serviceType;

    // request status
    private String status;  // PENDING, ACCEPTED, COMPLETED

    public void setStatus(String status) {
        this.status = status;
    }
}