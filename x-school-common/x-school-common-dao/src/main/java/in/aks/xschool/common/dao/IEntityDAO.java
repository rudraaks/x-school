package in.aks.xschool.common.dao;

import java.util.List;

import in.aks.xschool.common.entities.IdEntity;

public interface IEntityDAO<T extends IdEntity> {

	List<T> list(Class<T> T);
	
	T getById(Long id);
	
	Long create(T entity);
	
	
}
