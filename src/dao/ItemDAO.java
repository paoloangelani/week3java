package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

//import org.hibernate.query.Query;

import model.Book;
import model.ReadableItem;
import util.JpaUtil;

public class ItemDAO {
	
	public static void save(ReadableItem item) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
	
			em.persist(item);
	
			transaction.commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
	
		 System.out.println("Error saving object: " + item.getClass().getSimpleName());
		 System.out.println(ex);
			throw ex;
		}
	}
	public static ReadableItem getById(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {

			return em.find(ReadableItem.class, id);

		} finally {
			em.close();
		}
	}
	
	public static void delete(int id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			
			Query queryDelete;
			if (getById(id) instanceof Book) {
				queryDelete = em.createQuery("DELETE Book b WHERE b.isbn =" + id);
			} else {
				queryDelete = em.createQuery("DELETE Magazine m WHERE m.isbn =" + id);
			}
			queryDelete.executeUpdate();
			em.getTransaction().commit();
			
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Error deleting object");
			throw ex;
		} finally {
			em.close();
		}
	}
	
	public static List<ReadableItem> findByYear (int year) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try { 
			Query querySelect = em.createQuery("SELECT r FROM ReadableItem r WHERE r.yearOfRelease =" + year);
			List<ReadableItem> resList = (List<ReadableItem>) querySelect.getResultList();
			return resList;
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Error trying to find by Year");
			throw ex;
		} finally {
			em.close();
		}
	}
	
	public static List<ReadableItem> findByAuthor (String author) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try { 
			Query querySelect = em.createQuery("SELECT b FROM Book b WHERE b.author =" + author);
			List<ReadableItem> resList = (List<ReadableItem>) querySelect.getResultList();
			return resList;
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Error trying to find by Author");
			throw ex;
		} finally {
			em.close();
		}
	}
	
	public static List<ReadableItem> findByTitle (String title) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query querySelect = em.createQuery("SELECT r FROM ReadableItem r WHERE r.title LIKE '%" + title + "%'");
			List<ReadableItem> resList = (List<ReadableItem>) querySelect.getResultList();
			return resList;
		} catch (Exception ex) {
			em.getTransaction().rollback();
			System.out.println("Error trying to find by Title");
			throw ex;
		} finally {
			em.close();
		}
	}

}
