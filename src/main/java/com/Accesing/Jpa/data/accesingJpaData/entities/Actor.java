package com.Accesing.Jpa.data.accesingJpaData.entities;

import lombok.*;
import lombok.experimental.Accessors;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = "title")
@ToString
@Accessors(chain = true)
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "actor")
    @ToString.Exclude
    Set<Title> title;
}