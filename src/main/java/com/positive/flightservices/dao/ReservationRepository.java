package com.positive.flightservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.positive.flightservices.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
