package model;

import java.time.LocalDate;

public class RentDto {
	
	private Integer Id;
	
	private UserEntity user;
	private CarEntity car;
	private LocalDate initD;
	private LocalDate finalD;
	private Double price;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public RentDto(Integer id, UserEntity user, CarEntity car, LocalDate initD, LocalDate finalD, Double price) {
		super();
		Id = id;
		this.user = user;
		this.car = car;
		this.initD = initD;
		this.finalD = finalD;
		this.price = price;
	}
	@Override
	public String toString() {
		return "RentDto [Id=" + Id + ", user=" + user + ", car=" + car + ", initD=" + initD + ", finalD=" + finalD
				+ ", price=" + price + "]";
	}
	public CarEntity getCar() {
		return car;
	}
	public void setCar(CarEntity car) {
		this.car = car;
	}
	public LocalDate getInitD() {
		return initD;
	}
	public void setInitD(LocalDate initD) {
		this.initD = initD;
	}
	public LocalDate getFinalD() {
		return finalD;
	}
	public void setFinalD(LocalDate finalD) {
		this.finalD = finalD;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
