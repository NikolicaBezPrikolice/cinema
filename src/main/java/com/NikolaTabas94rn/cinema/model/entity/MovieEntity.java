package com.NikolaTabas94rn.cinema.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String  title;

    private String director;
    @Column(nullable = false)
    private String genre;
    @Column(length = 1024)
    private String description;

    private int duration_min;
    @OneToMany(mappedBy = "movie")
    @Singular
    private List<ScreeningEntity> screenings;

}
