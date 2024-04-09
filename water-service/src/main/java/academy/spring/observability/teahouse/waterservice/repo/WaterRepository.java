package academy.spring.observability.teahouse.waterservice.repo;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface WaterRepository extends CrudRepository<Water, UUID> {
	Optional<Water> findBySize(@Param("size") String size);
}
