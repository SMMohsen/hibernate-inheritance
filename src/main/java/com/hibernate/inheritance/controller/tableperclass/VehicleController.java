package com.hibernate.inheritance.controller.tableperclass;

import com.hibernate.inheritance.model.tableperclass.Bus;
import com.hibernate.inheritance.model.tableperclass.Car;
import com.hibernate.inheritance.model.tableperclass.Vehicle;
import com.hibernate.inheritance.service.tableperclass.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;


    @PostMapping
    public void createNewVehicle(@RequestBody Vehicle vehicle) {

        vehicleService.addNewVehicle(vehicle);

    }

    @PostMapping("/car")
    public void createNewCar(@RequestBody Car car) {

        vehicleService.addNewCar(car);

    }

    @PostMapping("/bus")
    public void createNewBus(@RequestBody Bus bus) {

        vehicleService.addNewBus(bus);

    }

    @GetMapping
    public List<Vehicle> getAllVehicles() {

        return vehicleService.getAllVehicles();

    }

    @GetMapping("/bus")
    public List<Bus> getAllBuses() {

        return vehicleService.getAllBuses();

    }
}
