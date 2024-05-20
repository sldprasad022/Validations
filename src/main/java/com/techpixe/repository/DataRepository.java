package com.techpixe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techpixe.entity.Data;

public interface DataRepository extends JpaRepository<Data, Long> {

}
