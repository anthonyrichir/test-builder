package com.anthonyrichir.test.builder;

import javax.persistence.Persistence;

/**
 * Base class for implementing builders with persistence in test classes.
 * <br/>
 * The build method should return the target object T after persisting it.
 *
 * @author Anthony Richir
 */
public abstract class AbstractPersistenceTestBuilder<T> extends AbstractTestBuilder<T> {

	public T buildAndPersist() {
		T target = build();
		Persistence.createEntityManagerFactory(getPersistenceUnitName()).createEntityManager()
				.persist(target);
		return target;
	}

	protected abstract String getPersistenceUnitName();
}