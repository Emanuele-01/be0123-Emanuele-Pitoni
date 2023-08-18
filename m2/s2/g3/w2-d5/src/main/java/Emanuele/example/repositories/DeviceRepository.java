package Emanuele.example.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Emanuele.example.entities.Device;


@Repository
public interface DeviceRepository extends JpaRepository<Device, UUID>{

}
