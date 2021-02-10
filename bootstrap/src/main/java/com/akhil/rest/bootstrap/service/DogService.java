package com.akhil.rest.bootstrap.service;

import com.akhil.rest.bootstrap.entity.Dog;
import java.util.List;


public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
