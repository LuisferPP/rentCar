package model;

import java.time.LocalDate;

public class ResultRentDto {
	private String title;
	private LocalDate init;
	private LocalDate finalD;
	private Double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getInit() {
		return init;
	}
	public void setInit(LocalDate init) {
		this.init = init;
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
	@Override
	public String toString() {
		return "ResultRentDto [title=" + title + ", init=" + init + ", finalD=" + finalD + ", price=" + price + "]";
	}
	public ResultRentDto(String title, LocalDate init, LocalDate finalD, Double price) {
		super();
		this.title = title;
		this.init = init;
		this.finalD = finalD;
		this.price = price;
	}
	
	public ResultRentDto() {};
	
}
