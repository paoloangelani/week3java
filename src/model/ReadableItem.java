package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name = "items")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ReadableItem implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@OnDelete(action = OnDeleteAction.CASCADE)
	protected int isbn;
	
	
	@Column(nullable = false)
	protected String title;
	
	@Column(nullable = false)
	protected int yearOfRelease;
	
	@Column(nullable = false)
	protected int numberOfPage;

	public int getISBN() {
		return isbn;
	}

	public void setISBN(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}
}

