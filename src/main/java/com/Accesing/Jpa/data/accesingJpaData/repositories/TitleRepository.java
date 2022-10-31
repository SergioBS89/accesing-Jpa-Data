package com.Accesing.Jpa.data.accesingJpaData.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.Accesing.Jpa.data.accesingJpaData.entities.Actor;

public interface TitleRepository extends PagingAndSortingRepository<Actor, Integer> {

}