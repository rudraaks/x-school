package in.aks.xschool.common.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import in.aks.xschool.common.entities.IdEntity;

@Stateless
@Transactional(Transactional.TxType.SUPPORTS)
public class EntityDAO<T extends IdEntity> implements IEntityDAO<T>
{

	@PersistenceContext(unitName="primary")
	protected EntityManager entityManager;

	public List<T> list(Class<T> T)
	{
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		
		CriteriaQuery<T> query = builder.createQuery(T);
		Root<T> root = query.from(T);
		
		query.select(root);
		TypedQuery<T> typedQuery = entityManager.createQuery(query);
		return typedQuery.getResultList();
		
	}

	public T getById(Long id) {
		return null;
	}
	
	public Long create(T entity) {
		return null;
	}
}
