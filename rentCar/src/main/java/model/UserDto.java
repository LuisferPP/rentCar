package model;

import java.util.List;

public class UserDto {
	
	private Integer id;
	private String name;
	private List<CarDto> car;
	private List<RentDto> rent;
	
	public UserDto(Integer id, String name, CarDto car, RentDto rent) {
		super();
		this.id = id;
		this.name = name;
		this.car.add(car);
		this.rent.add(rent);
	}
	
	
	public UserDto(Integer id, String name, List<CarDto> car, List<RentDto> rent) {
		super();
		this.id = id;
		this.name = name;
		this.car = car;
		this.rent = rent;
	}


	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", car=" + car + ", rent=" + rent + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<CarDto> getCar() {
		return car;
	}


	public void setCar(List<CarDto> car) {
		this.car = car;
	}


	public List<RentDto> getRent() {
		return rent;
	}


	public void setRent(List<RentDto> rent) {
		this.rent = rent;
	}


	public UserDto() {};

}
