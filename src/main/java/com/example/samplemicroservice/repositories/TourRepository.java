package com.example.samplemicroservice.repositories;

import com.example.samplemicroservice.models.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer> {

    Optional<Tour> findById(Integer id);

    List<Tour> findAll();
    List<Tour> findAllById(Iterable<Integer> iterable);
}
