package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.CarEntity;

public interface CarRepository extends JpaRepository<CarEntity, Integer>{

}
