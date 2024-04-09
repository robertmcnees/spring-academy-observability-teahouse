package academy.spring.observability.teahouse.tealeafservice.repo;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TealeafRepository extends CrudRepository<Tealeaf, UUID> {
	Optional<Tealeaf> findByName(@Param("name") String name);
}
