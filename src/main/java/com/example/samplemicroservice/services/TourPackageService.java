package com.example.samplemicroservice.services;

import com.example.samplemicroservice.models.TourPackage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TourPackageService {

    TourPackage createTourPackage(String code, String name);

    Long total();
    List<TourPackage> lookup();


}
