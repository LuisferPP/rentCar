package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CarEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@OneToMany
	private RentEntity rent;
	
	private String model;
	private String brand;
	public Integer getId() {
		return Id;
	}
	public RentEntity getRent() {
		return rent;
	}
	public void setRent(RentEntity rent) {
		this.rent = rent;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getModel() {
		return model;
	}
	@Override
	public String toString() {
		return "CarEntity [Id=" + Id + ", rent=" + rent + ", model=" + model + ", brand=" + brand + "]";
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
