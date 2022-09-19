package com.datajpaexercise.datajpa.controller;

import com.datajpaexercise.datajpa.model.Client;
import com.datajpaexercise.datajpa.repository.ClientRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Client> getAllFromRepository(){

        return clientRepository.findAll();

    }

    @PostMapping
    public Client saveToRepository(@NotNull @RequestBody Client client){

        return clientRepository.save(client);

    }

    @PutMapping
    public Client updateFromRepository(@NotNull @RequestBody Client client) {

        return clientRepository.save(client);

    }

    @DeleteMapping(value = "/{id}")
    public void deleteFromRepository(@PathVariable Long id){

            clientRepository.deleteById(id);

    }


}