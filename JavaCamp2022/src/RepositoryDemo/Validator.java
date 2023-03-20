package RepositoryDemo;

public class Validator {

	public <T extends IEntity> void validate(T entity) {
		System.out.println("Validate edildi " + entity);
	}
}
