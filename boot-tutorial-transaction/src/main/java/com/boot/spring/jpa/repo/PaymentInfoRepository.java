package com.boot.spring.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.spring.jpa.entity.PaymentInfo;

@Repository
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
