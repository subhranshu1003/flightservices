package com.positive.flightservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.positive.flightservices.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
