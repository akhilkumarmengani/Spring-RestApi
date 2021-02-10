package com.akhil.rest.bootstrap.service;

import com.akhil.rest.bootstrap.entity.Dog;
import com.akhil.rest.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    private DogRepository dogRepository;

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreed() {
        return dogRepository.findAllBreed();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        return dogRepository.findBreedById(id);
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.findAllName();
    }
}
