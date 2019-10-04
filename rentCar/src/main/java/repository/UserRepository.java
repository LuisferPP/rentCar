package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
