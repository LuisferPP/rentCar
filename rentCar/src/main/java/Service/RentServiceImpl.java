package Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.CarEntity;
import model.RentEntity;
import model.ResultRentDto;
import repository.CarRepository;
import repository.RentRepository;

@Service
public class RentServiceImpl implements RentService{
	@Autowired
	private RentRepository rentRepository;
	@Autowired
	private CarRepository carRepository;
	@Override
	public ResultRentDto carProfit(Integer idCar, LocalDate init, LocalDate finalRent) {
		RentEntity rentEntity = rentRepository.findByCar(idCar);
		Optional<CarEntity> carEntity = carRepository.findById(idCar);
		ResultRentDto resultRentDto = new ResultRentDto();

		Integer diffDays = Period.between(init, finalRent).getDays();
		Double profit = diffDays * rentEntity.getPrice();
		resultRentDto.setFinalD(finalRent);
		resultRentDto.setInit(finalRent);
		resultRentDto.setPrice(profit);
		resultRentDto.setTitle(carEntity.get().getModel()+carEntity.get().getBrand());
		return resultRentDto;
		
	}
	

}
