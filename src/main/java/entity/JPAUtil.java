package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/*
 * Entidade para persistencia de objetos no banco
 * 
 */
public class JPAUtil {
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AppAutomovel");

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
}
