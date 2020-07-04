package com.salesmanager.core.business.repositories.services;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesmanager.core.model.services.Services;

public interface ServicesRepository extends JpaRepository<Services, Integer> {

	@Query("select s from Services s where s.id in (?1)")
	public List<Services> findServicesByIds(List<BigInteger> serviceIds);
}
