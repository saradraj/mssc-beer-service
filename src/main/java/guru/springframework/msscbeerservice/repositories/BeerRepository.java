package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BeerRepository extends CrudRepository<Beer, UUID> {
}
