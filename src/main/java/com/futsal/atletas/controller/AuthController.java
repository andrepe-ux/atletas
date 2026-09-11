package com.futsal.atletas.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        // Credenciais solicitadas: Admin / Admin123  ou  Dinamo / Admin
        if ("Admin".equals(username) && "Admin123".equals(password)) {
            return ResponseEntity.ok(Map.of("success", true, "username", username, "role", "ADMIN"));
        }
        
        if ("Dinamo".equals(username) && "Admin".equals(password)) {
            return ResponseEntity.ok(Map.of("success", true, "username", username, "role", "USER"));
        }

        return ResponseEntity.status(401).body(Map.of("success", false, "message", "Credenciais inválidas"));
    }
}