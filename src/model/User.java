package model;

import java.time.LocalDate;

public class User {		
	
	private String name;
	private String surname;
	private LocalDate DOB;
	private int cardNum;
	
	public User(String name, String surname, LocalDate dOB, int cardNum) {
		this.name = name;
		this.surname = surname;
		DOB = dOB;
		this.cardNum = cardNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public int getCardNum() {
		return cardNum;
	}
	
}
