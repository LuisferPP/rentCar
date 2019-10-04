package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	private Integer user;
	private Integer car;
	private LocalDate initD;
	private LocalDate finalD;
	private Double price;
	public Integer getId() {
		return Id;
	}
	@Override
	public String toString() {
		return "RentEntity [Id=" + Id + ", user=" + user + ", car=" + car + ", initD=" + initD + ", finalD=" + finalD
				+ ", price=" + price + "]";
	}
	public RentEntity(Integer id, Integer user, Integer car, LocalDate initD, LocalDate finalD, Double price) {
		super();
		Id = id;
		this.user = user;
		this.car = car;
		this.initD = initD;
		this.finalD = finalD;
		this.price = price;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public Integer getCar() {
		return car;
	}
	public void setCar(Integer car) {
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
