package Service;

import java.time.LocalDate;

import model.ResultRentDto;

public interface RentService {
	/**
	 * 
	 * @param idCar
	 * @param init
	 * @param finalRent
	 * @return
	 */
	public ResultRentDto carProfit(Integer idCar, LocalDate init, LocalDate finalRent);
	
}
