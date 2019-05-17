package com.domain.impl;

import com.dao.ClothesEntity;
import com.dao.ClothesRepository;
import com.domain.ClothesService;
import com.domain.model.Clothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClothesServiceImpl implements ClothesService {

    @Autowired
    private ClothesRepository clothesRepository;

    @Override
    public List<Clothes> findAll() {
        return Collections.unmodifiableList(clothesRepository.findAll());
    }

    @Override
    public Optional<Clothes> findById(final Long id) {
        Optional<ClothesEntity> optClothes = clothesRepository.findById(id);
        return optClothes.map(it -> (Clothes) it);
    }

    @Override
    public Clothes save(Clothes clothes) {
        return clothesRepository.save(new ClothesEntity(clothes));
    }

    @Override
    public Clothes update(Long id, Clothes clothes) {
        if (!clothesRepository.existsById(id)) {
            return new ClothesEntity();
        }
        return clothesRepository.save(new ClothesEntity(clothes));
    }

    @Override
    public void delete(Long id) {
        clothesRepository.deleteById(id);
    }
}
