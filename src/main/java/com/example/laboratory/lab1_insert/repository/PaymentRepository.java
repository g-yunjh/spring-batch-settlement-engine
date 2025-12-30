package com.example.laboratory.lab1_insert.repository;

import com.example.laboratory.lab1_insert.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}