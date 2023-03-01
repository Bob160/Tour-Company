package com.example.samplemicroservice.models;

import com.example.samplemicroservice.enums.Difficulty;
import com.example.samplemicroservice.enums.Region;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tour {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String title;
    @Column(length = 2000)
    private String description;
    @Column(length = 2000)
    private String blurb;
    @Column
    private Integer price;
    @Column
    private Integer duration;
    @Column(length = 2000)
    private String bullets;
    @Column
    private String keywords;

    @ManyToOne
    @JoinColumn(name = "tour_package_id")
    private TourPackage tourPackage;
    @Column
    @Enumerated
    private Region region;

    @Column
    @Enumerated
    private Difficulty difficulty;

//    public TourPackage getTourPackage() {
//        return tourPackage;
//    }

//    public void setTourPackage(TourPackage tourPackage) {
//        this.tourPackage = tourPackage;
//    }


}
