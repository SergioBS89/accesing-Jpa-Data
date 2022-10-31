package com.Accesing.Jpa.data.accesingJpaData.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.Accesing.Jpa.data.accesingJpaData.entities.Title;

public interface ActorRepository extends PagingAndSortingRepository<Title, Integer> {

}