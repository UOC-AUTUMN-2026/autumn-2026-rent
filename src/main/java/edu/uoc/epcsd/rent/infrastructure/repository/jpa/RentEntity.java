package edu.uoc.epcsd.rent.infrastructure.repository.jpa;

import edu.uoc.epcsd.rent.domain.RentStatus;
import edu.uoc.epcsd.rent.domain.Rent;
import lombok.*;

import java.util.Date;
import jakarta.persistence.*;

@Entity(name = "rent")
@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder 
public class RentEntity implements DomainTranslatable<Rent> {

	 //TODO

}
