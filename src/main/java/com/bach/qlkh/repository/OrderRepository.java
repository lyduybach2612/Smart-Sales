package com.bach.qlkh.repository;

import com.bach.qlkh.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
