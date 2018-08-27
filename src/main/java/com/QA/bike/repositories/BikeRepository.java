package com.QA.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QA.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> 
{

}
