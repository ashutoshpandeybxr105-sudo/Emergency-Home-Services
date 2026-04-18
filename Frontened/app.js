const API = "http://localhost:8080/api";

/* =========================
   CREATE REQUEST
========================= */
function sendRequest() {

    let data = {
        userId: document.getElementById("userId").value,
        serviceType: document.getElementById("serviceType").value
    };

    fetch(API + "/request", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
    .then(res => res.json())
    .then(data => {
        alert("Request Created! ID: " + data.id);

        // auto refresh table after creating request
        loadRequests();
    })
    .catch(error => {
        console.error("Error:", error);
        alert("Error creating request");
    });
}

/* =========================
   LOAD REQUESTS (USED IN index.html)
========================= */
function loadRequests() {

    fetch(API + "/requests")
    .then(res => res.json())
    .then(data => {

        let table = document.getElementById("table");

        // clear old rows + header
        table.innerHTML = `
        <tr>
            <th>ID</th>
            <th>User ID</th>
            <th>Service Type</th>
            <th>Status</th>
        </tr>`;

        data.forEach(req => {

            let color =
                req.status === "COMPLETED" ? "green" :
                req.status === "PENDING" ? "orange" : "red";

            table.innerHTML += `
            <tr>
                <td>${req.id}</td>
                <td>${req.userId}</td>
                <td>${req.serviceType}</td>
                <td style="color:${color}; font-weight:bold">
                    ${req.status}
                </td>
            </tr>`;
        });
    })
    .catch(error => {
        console.error("Error:", error);
        alert("Error loading requests");
    });
}