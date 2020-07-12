package com.positive.flightservices.service;

import com.positive.flightservices.model.Flight;

import java.util.Date;
import java.util.List;

public interface FlightService {
    public List<Flight> findFlights(String from, String to, Date departureDate);

}
