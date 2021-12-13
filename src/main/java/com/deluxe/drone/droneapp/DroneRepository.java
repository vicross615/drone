package com.deluxe.drone.droneapp;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DroneRepository {

    private final JdbcTemplate jdbcTemplate;

    public DroneRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Drone> fetchAvailableDrones() {
        String sql = "";
        List<Drone> droneList = jdbcTemplate.queryForList(sql, Drone.class);
        return droneList;
    }
}
