package com.Accesing.Jpa.data.accesingJpaData.entities;

import lombok.*;
import lombok.experimental.Accessors;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(exclude = { "director", "actor", "category" })
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotBlank
    @Column(name = "name")
    private String name;

    // @JsonIgnore
    // @ManyToMany
    // @JoinTable(name = "title_director")
    // @ToString.Exclude
    // Set<Director> director;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "title_actor")
    @ToString.Exclude
    Set<Actor> actor;

    // @JsonIgnore
    // @ManyToMany
    // @JoinTable(name = "title_category")
    // @ToString.Exclude
    // Set<Category> category;

    @NotBlank
    @Column(name = "date_added")
    private String dateAdded;

    @NotBlank
    @Min(1900)

    @Column(name = "release_year")
    private String releaseYear;

    @NotBlank
    private String rating;

    @NotBlank
    private String duration;

    @Column(length = 4095)
    private String description;

    @Min(0)
    @Max(10)
    @Column(name = "user_rating")
    private Float userRating = 0F;

    @Min(0)
    @Column(name = "num_ratings")
    private Integer numRatings = 0;

}