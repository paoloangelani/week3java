package library;

import dao.ItemDAO;
import model.Book;
import model.Magazine;
import model.Periodicity;


public class Main {

	public static void main(String[] args) {
		
		Magazine m = new Magazine();
		m.setTitle("Tolkien Fanz");
		m.setYearOfRelease(2023);
		m.setNumberOfPage(30);
		m.setRelease(Periodicity.MENSILE);

		Book b = new Book();
		b.setTitle("Fellowship of the Ring");
		b.setAuthor("J.R.R Tolkien");
		b.setGenre("Fantasy");
		b.setYearOfRelease(1954);
		b.setNumberOfPage(423);
		
		Book b1 = new Book();
		b1.setTitle("The Two Towers");
		b1.setAuthor("J.R.R Tolkien");
		b1.setGenre("Fantasy");
		b1.setYearOfRelease(1954);
		b1.setNumberOfPage(477);
		
		Book b2 = new Book();
		b2.setTitle("The Two Towerz");
		b2.setAuthor("Tolkien");
		b2.setGenre("Fantasy");
		b2.setYearOfRelease(1954);
		b2.setNumberOfPage(477);
		
//		ItemDAO.save(b2);
//		ItemDAO.save(m);
		
//		ItemDAO.delete(3);		
//		System.out.println(ItemDAO.findByYear(1954));
//		System.out.println(ItemDAO.findByAuthor("'J.R.R Tolkien'"));
//		System.out.println(ItemDAO.findByTitle("Towers"));
	}

}
