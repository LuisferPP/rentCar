package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.RentEntity;

public interface RentRepository extends JpaRepository<RentEntity, Integer>{

	@Query("Select r from RentEntity r where r.car = car")
	public RentEntity findByCar(@Param("car") Integer idCar);
	
}
