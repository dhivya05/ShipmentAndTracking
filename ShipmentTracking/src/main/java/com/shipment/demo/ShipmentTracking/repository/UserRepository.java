package com.shipment.demo.ShipmentTracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shipment.demo.ShipmentTracking.entity.User;




@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
