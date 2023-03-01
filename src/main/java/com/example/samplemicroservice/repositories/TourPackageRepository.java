package com.example.samplemicroservice.repositories;

import com.example.samplemicroservice.models.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackage, String> {
    Optional<TourPackage> findById(String code);
    Optional<TourPackage> findByName(String name);

    List<TourPackage> findAll();
    List<TourPackage> findAllById(Iterable<String> id);
}
