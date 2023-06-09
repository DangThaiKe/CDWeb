package com.example.CDWeb.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CDWeb.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

	List<Orders> findByUserUserid(int userid);

	List<Orders> findByUserUseridAndOrderStatus(int userid, String orderStatus);
	
	
}