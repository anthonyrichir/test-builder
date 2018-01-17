# test-builder

This tiny library provides only one abstract generic class at this time: AbstractPersistenceTestBuilder.
When implementing it, you will need to provide an EntityManager instance to the constructor and implement the build() method which should return an instance of the generic object associated to your implementation. 
