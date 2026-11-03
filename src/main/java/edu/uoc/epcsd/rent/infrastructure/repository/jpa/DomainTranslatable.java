package edu.uoc.epcsd.rent.infrastructure.repository.jpa;

public interface DomainTranslatable<T> {

    T toDomain();

}
