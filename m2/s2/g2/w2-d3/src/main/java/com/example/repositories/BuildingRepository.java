package com.example.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Building;

@Repository
public interface BuildingRepository extends JpaRepository<Building, UUID>{

}
