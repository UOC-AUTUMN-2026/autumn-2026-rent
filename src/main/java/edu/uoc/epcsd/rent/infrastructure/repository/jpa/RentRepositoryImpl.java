package edu.uoc.epcsd.rent.infrastructure.repository.jpa;

import edu.uoc.epcsd.rent.domain.Rent;
import edu.uoc.epcsd.rent.domain.repository.RentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class RentRepositoryImpl implements RentRepository {

    private final SpringDataRentRepository jpaRentRepository;

    //TODO
}
