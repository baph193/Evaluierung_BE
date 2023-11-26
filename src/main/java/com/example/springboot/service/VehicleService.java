package com.example.springboot.service;

import com.example.springboot.model.Vehicle;
import com.example.springboot.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    /**
     * function searches all vehicles from the DB table and returns them as a list
     * @return list with vehicle
     */
    public List<Vehicle> getAllVehicles()
    {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicleRepository.findAll().forEach(vehicles::add);
        return vehicles;
    }

    /**
     * function looks for the vehicle that is to be deleted from the DB table.
     * The vehicle is then deleted from the table and displayed in the console.
     * @param vin id of the vehicle, that is to be deleted
     */
    public void delete(String vin)
    {
        Vehicle vehicle = vehicleRepository.findById(vin).get();
        vehicleRepository.deleteById(vin);
        System.out.println(vehicle.toString() + " was deleted !");
    }

    /**
     * saves all vehicles from the list in the DB table
     * @param vehicles list with vehicles
     */
    public void save(List<Vehicle> vehicles)
    {
        vehicleRepository.saveAll(vehicles);
    }
}
