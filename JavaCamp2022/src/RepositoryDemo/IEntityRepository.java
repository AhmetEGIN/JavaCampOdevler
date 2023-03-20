package RepositoryDemo;

public interface IEntityRepository<T extends IEntity> {
	
	
	//generic constraints -- generic kýsýtlar
	// Veri tabaný nesnesi ile ilgili olmayan class'larý bu repository' ye göndermemek için generic constraints kullanýrýz
	void add(T entity);
	void delete(T entity);
	void update(T entity);
	T getAll();
	
	
	
}
