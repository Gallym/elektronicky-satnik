package com.web;

import com.dao.ClothesEntity;
import com.domain.ClothesService;
import com.domain.model.Clothes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clothes")
public class ClothesController {

    @Autowired
    private ClothesService clothesService;

    @GetMapping(produces = "application/json")
    public List<Clothes> getClothesList() {
        return clothesService.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Clothes> getClothesList(@PathVariable(value = "id") Long id) {
        Optional<Clothes> clothes = clothesService.findById(id);
        if (!clothes.isPresent()) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(clothes.get());
    }

    @PostMapping(produces = "application/json")
    public Clothes createClothes(@Valid @RequestBody ClothesEntity clothes) {
        return clothesService.save(clothes);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public Clothes update(@PathVariable(value = "id") Long id, @Valid @RequestBody ClothesEntity clothes) {
        return clothesService.update(id, clothes);
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        if (!clothesService.findById(id).isPresent()) {
           return  ResponseEntity.badRequest().build();
        }
        clothesService.delete(id);
        return  ResponseEntity.ok().build();
    }

}
