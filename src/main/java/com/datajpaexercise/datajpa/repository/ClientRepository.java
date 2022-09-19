package com.datajpaexercise.datajpa.repository;

import com.datajpaexercise.datajpa.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
