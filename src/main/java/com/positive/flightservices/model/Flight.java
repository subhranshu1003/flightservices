package com.positive.flightservices.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter 
@NoArgsConstructor
public class Flight extends AbstractEntity{

	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;


}
