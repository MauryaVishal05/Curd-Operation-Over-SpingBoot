package com.noscrop.crud_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.noscrop.crud_demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
