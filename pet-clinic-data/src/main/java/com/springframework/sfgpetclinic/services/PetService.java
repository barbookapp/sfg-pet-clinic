package com.springframework.sfgpetclinic.services;

import com.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface PetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
