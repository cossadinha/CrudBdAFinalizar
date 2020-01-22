package br.gft.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.gft.entidade.Cidadao;

public class CidadaoDao implements Dao<Cidadao> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpa");

	public void inserir(Cidadao cidadao) {
		EntityManager entityManager = emf.createEntityManager();
		try {

			entityManager.getTransaction().begin();
			System.out.println("Salvando a pessoa.");

			entityManager.persist(cidadao);
			entityManager.getTransaction().commit();
		} finally {
		}
		return;
	}

	public void alterar(Cidadao cidadao) {

		EntityManager entityManager = emf.createEntityManager();

		entityManager.getTransaction().begin();

		cidadao = entityManager.merge(cidadao);

	}

	public void excluir(Cidadao cidadao) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.remove(em.merge(cidadao));
		em.getTransaction().commit();
	}

	public List<Cidadao> listar() {
		EntityManager em = Conexao.getInstance();
		Query q = em.createQuery("from Cidadao");
		return q.getResultList();
		
	}

	public Cidadao buscarPorCodCidadao(Integer codCidadao) {
		EntityManager em = emf.createEntityManager();
		
		return em.find(Cidadao.class, codCidadao);
	}

	@Override
	public Cidadao buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
