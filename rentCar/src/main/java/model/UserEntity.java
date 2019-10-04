package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	private String name;
	
	@OneToMany
	private CarEntity car;
	
	@OneToMany
	private RentEntity rent;
	
	public CarEntity getCar() {
		return car;
	}

	public void setCar(CarEntity car) {
		this.car = car;
	}

	public RentEntity getRent() {
		return rent;
	}

	public void setRent(RentEntity rent) {
		this.rent = rent;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserEntity [Id=" + Id + ", name=" + name + "]";
	}
	
	
}
