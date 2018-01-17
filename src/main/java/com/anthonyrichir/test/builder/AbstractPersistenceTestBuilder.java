package com.anthonyrichir.test.builder;

import javax.persistence.EntityManager;

/**
 * Base class for implementing builders with persistence in test classes.
 * <br/>
 * The build method should return the target object T after persisting it.
 *
 * @author Anthony Richir
 */
public abstract class AbstractPersistenceTestBuilder<T> {

	private final EntityManager em;
 
	public AbstractPersistenceTestBuilder(EntityManager em) {
	   this.em = em;
	}
 
	public T buildAndPersist() {
	   T target = build(); // Builds the object via the implementation provided by the concrete class
	   em.persist(target); // Persists the created object
	   return target; // Returns the instance linked to the persistence context
	}
 
	public abstract T build();
 }