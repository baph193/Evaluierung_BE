package com.example.springboot.controller;

import com.example.springboot.model.Vehicle;
import com.example.springboot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping("/vehicles")
    private List<Vehicle> getAllVehicles()
    {
        return vehicleService.getAllVehicles();
    }
    @DeleteMapping("/vehicle/{vin}")
    private void deleteVehicle(@PathVariable("vin") String vin)
    {
        vehicleService.delete(vin);
    }


}
