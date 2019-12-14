package com.sukriti.backend.billingorder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sukriti.backend.billingorder.entity.Order;

@Repository
public interface OrderRpository extends JpaRepository<Order, Integer>{
	
	Order getOne(Integer id);

}
