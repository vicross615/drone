package com.deluxe.drone.droneapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneService {

    @Autowired
    private DroneRepository droneRepository;

    public String registerDrone(){
        return "drone";
    }

    public boolean loadDrone(Medication medication){
        return true;
    }

    public Medication fetchMedicationByDrone(String droneRef){
        return new Medication();
    }

    public List<Drone> fetchAvailableDrones(){
      return  this.droneRepository.fetchAvailableDrones();
    }

    public Object getDroneBatteryLevel(String droneRef){
        return null;
    }
}
