package com.frankmoley.lil.designpatternsapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresidentRepository extends CrudRepository<PresidentEntity, Long> {
    PresidentEntity findByEmailAddress(String emailAddress);

}
