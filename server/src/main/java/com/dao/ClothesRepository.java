package com.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ClothesRepository extends CrudRepository<ClothesEntity, Long> {
    @Override
    List<ClothesEntity> findAll();

    Optional<ClothesEntity> findById(long id);

}
