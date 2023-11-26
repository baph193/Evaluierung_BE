package com.example.springboot.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.springboot.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, String>
{
}