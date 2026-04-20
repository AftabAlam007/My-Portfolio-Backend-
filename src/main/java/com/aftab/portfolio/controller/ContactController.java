package com.aftab.portfolio.controller;

import com.aftab.portfolio.model.Contact;
import com.aftab.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public ResponseEntity<Map<String, String>> submitContact(@Valid @RequestBody Contact contact) {
        contactService.saveContact(contact);

        Map<String, String> response = new HashMap<>();
        response.put("message", "Contact form submitted successfully");

        return ResponseEntity.ok(response);
    }
}