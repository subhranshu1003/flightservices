package com.positive.flightservices.service;

import com.positive.flightservices.dao.FlightRepository;
import com.positive.flightservices.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class FlightServiceImpl implements FlightService{
    @Autowired
    private FlightRepository flightRepository;
    @Override
    public List<Flight> findFlights(String from, String to, Date departureDate) {
        return flightRepository.findFlights(from,to,departureDate);
    }
}
