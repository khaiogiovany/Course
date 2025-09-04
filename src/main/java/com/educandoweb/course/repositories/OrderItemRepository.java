package com.educandoweb.course.repositories;

import com.educandoweb.course.entity.OrderItem;
import com.educandoweb.course.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
