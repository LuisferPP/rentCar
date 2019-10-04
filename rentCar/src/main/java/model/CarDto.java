package model;

import java.util.List;

public class CarDto {
	private Integer id;
	private String model;
	private String brand;
	private List<RentDto> rent;
	public CarDto(Integer id, String model, String brand, List<RentDto> rent) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.rent = rent;
	}
	
	public List<RentDto> getRent() {
		return rent;
	}

	public void setRent(List<RentDto> rent) {
		this.rent = rent;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModel() {
		return model;
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
	
	@Override
	public String toString() {
		return "CarDto [id=" + id + ", model=" + model + ", brand=" + brand + ", rent=" + rent + "]";
	}
	
	public CarDto() {};
}
