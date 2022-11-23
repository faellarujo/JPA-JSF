package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entity.JPAUtil;

public class PersistidorDeAutomovel {

	public static void main(String[] args) {		
		
		EntityManager entityManager = JPAUtil.getEntityManager();		
		
		Automovel automovel = new Automovel();
		automovel.setAnoFabricacao(2020);
		automovel.setModelo("Ferrari");
		automovel.setMarca("Fiat");
		automovel.setObservacoes("Nunca foi batido");
		automovel.setAnoFabricacao(200);
		automovel.setAnoModelo(2019);		
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(automovel);
		entityTransaction.commit();
		entityManager.close();
	}

}
