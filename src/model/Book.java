package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book extends ReadableItem{
	
	
	@Column(nullable = false)
	private String author;
	
	@Column(nullable = false)
	private String genre;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String toString() {
		String res= "\nBook:";
		res += "\n Title: " + title;
		res += "\n Author: " + author;
		res += "\n Genre: " + genre;
		res += "\n Year: " + yearOfRelease;
		res += "\n Pages: " + numberOfPage;
		res += "\n";
		return res;
	}
	
}
