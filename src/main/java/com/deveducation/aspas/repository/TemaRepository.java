package com.deveducation.aspas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deveducation.aspas.model.TemaModel;

interface TemaRepository extends JpaRepository<TemaModel, Long> {
	
}
