package com.example.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City, UUID>{

}
