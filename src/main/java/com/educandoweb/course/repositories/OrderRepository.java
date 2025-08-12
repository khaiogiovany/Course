package com.educandoweb.course.repositories;

import com.educandoweb.course.entity.Order;
import com.educandoweb.course.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
