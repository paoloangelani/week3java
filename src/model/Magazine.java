package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
//@Table(name = "magazines")
public class Magazine extends ReadableItem {
	
//	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Periodicity release;

	public Periodicity getRelease() {
		return release;
	}

	public void setRelease(Periodicity release) {
		this.release = release;
	}

	public String toString() {
		String res= "\nMagazine:";
		res += "\n Title: " + this.getTitle();
		res += "\n Release: " + this.getRelease();
		res += "\n Year: " + this.getYearOfRelease();
		res += "\n";
		return res;
	}
	
}
