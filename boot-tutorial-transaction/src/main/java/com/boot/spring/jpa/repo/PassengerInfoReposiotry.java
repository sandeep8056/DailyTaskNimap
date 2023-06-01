package com.boot.spring.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.spring.jpa.entity.PassengerInfo;

public interface PassengerInfoReposiotry  extends JpaRepository<PassengerInfo, Long>{

}
