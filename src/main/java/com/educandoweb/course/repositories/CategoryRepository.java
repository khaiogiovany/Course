package com.educandoweb.course.repositories;

import com.educandoweb.course.entity.Category;
import com.educandoweb.course.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
