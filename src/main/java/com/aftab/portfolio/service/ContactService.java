package com.aftab.portfolio.service;

import com.aftab.portfolio.model.Contact;
import com.aftab.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
}