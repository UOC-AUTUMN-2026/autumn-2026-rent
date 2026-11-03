package edu.uoc.epcsd.rent.infrastructure.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpringDataRentRepository extends JpaRepository<RentEntity, Long> {

	//@Query("select a from rent a where a.user = ?1 ")
	public List<RentEntity> findRentsByEmailUser(String email);
	
	//@Query("select a from rent a where a.serialnumber = ?1 ")
	public Optional<RentEntity> findRentById(Long rentId);
    
}
