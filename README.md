# test-builder

This tiny library provides only one abstract generic class at this time: AbstractPersistenceTestBuilder.
When implementing it, you will need to provide an EntityManager instance to the constructor and implement the build() method which should return an instance of the generic object associated to your implementation. 

See https://anthonyrichir.com/2017/12/11/builder-pattern-for-test-classes/ for more details.
