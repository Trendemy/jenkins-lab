package com.reservation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ReservationController {

    @PostMapping("/reserve")
    public ResponseEntity<String> reserve(@RequestBody ReservationRequest request) {
        System.out.println(">>> Received reservation for: " + request.getLocation());
        System.out.println(">>> Date: " + request.getDate());
        System.out.println(">>> Time: " + request.getTime());
        System.out.println(">>> People: " + request.getPeople());
        return ResponseEntity.ok("Reservation received for " + request.getLocation() + "✅ Đã nhận đặt bàn cho " + request.getPeople());
    }
}
