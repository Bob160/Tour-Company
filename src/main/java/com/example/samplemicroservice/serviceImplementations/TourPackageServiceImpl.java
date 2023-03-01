package com.example.samplemicroservice.serviceImplementations;

import com.example.samplemicroservice.models.TourPackage;
import com.example.samplemicroservice.repositories.TourPackageRepository;
import com.example.samplemicroservice.services.TourPackageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TourPackageServiceImpl implements TourPackageService {
    @Autowired
    private TourPackageRepository tourPackageRepository;
    @Override
    public TourPackage createTourPackage(String code, String name) {
        return tourPackageRepository.findById(code)
                .orElse(tourPackageRepository.save(new TourPackage(code, name)));
    }

    @Override
    public Long total() {
        return null;
    }

    @Override
    public List<TourPackage> lookup() {
        return null;
    }
}
