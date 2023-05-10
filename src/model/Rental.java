package model;

import java.time.LocalDate;

public class Rental {
	
	private User user;
	private ReadableItem rentedItem;
	private LocalDate dateOfRental;
	private LocalDate expDateOfReturn;
	private LocalDate dateOfReturn;
	
	public Rental(User user, ReadableItem rentedItem, LocalDate dateOfRental,
			LocalDate dateOfReturn) {
		this.user = user;
		this.rentedItem = rentedItem;
		this.dateOfRental = dateOfRental;
		this.expDateOfReturn = dateOfRental.plusDays(30);
		this.dateOfReturn = dateOfReturn;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ReadableItem getRentedItem() {
		return rentedItem;
	}

	public void setRentedItem(ReadableItem rentedItem) {
		this.rentedItem = rentedItem;
	}

	public LocalDate getDateOfRental() {
		return dateOfRental;
	}

	public void setDateOfRental(LocalDate dateOfRental) {
		this.dateOfRental = dateOfRental;
	}

	public LocalDate getExpDateOfReturn() {
		return expDateOfReturn;
	}

	public LocalDate getDateOfReturn() {
		return dateOfReturn;
	}

	public void setDateOfReturn(LocalDate dateOfReturn) {
		this.dateOfReturn = dateOfReturn;
	}
	
}
