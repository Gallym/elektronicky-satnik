package com.domain;

import com.domain.model.Clothes;

import java.util.List;
import java.util.Optional;

public interface ClothesService {
    List<Clothes> findAll();
    Optional<Clothes> findById(Long id);
    Clothes save(Clothes clothes);
    Clothes update(Long id, Clothes clothes);
    void delete(Long id);
}
