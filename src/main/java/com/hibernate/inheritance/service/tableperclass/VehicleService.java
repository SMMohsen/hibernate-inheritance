package com.hibernate.inheritance.service.tableperclass;

import com.hibernate.inheritance.model.tableperclass.Bus;
import com.hibernate.inheritance.model.tableperclass.Car;
import com.hibernate.inheritance.model.tableperclass.Vehicle;
import com.hibernate.inheritance.repository.tableperclass.BusRepository;
import com.hibernate.inheritance.repository.tableperclass.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    /*
    * pitfall of this method is that in case of retrieve data hibernate use union to get the data

     */

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private BusRepository busRepository;

    public void addNewVehicle(Vehicle vehicle) {

        vehicleRepository.save(vehicle);
    }

    public void addNewCar(Car car) {

        vehicleRepository.save(car);

    }

    public void addNewBus(Bus bus) {

        vehicleRepository.save(bus);

    }

    public List<Vehicle> getAllVehicles() {

        return vehicleRepository.findAll();

    }

    public List<Bus> getAllBuses() {

        return busRepository.findAll();

    }
}
