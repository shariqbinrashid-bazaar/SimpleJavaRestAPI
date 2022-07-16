package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Person;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "persons",path="persons")
public interface PersonRepo extends JpaRepository<Person,Integer> {
}
