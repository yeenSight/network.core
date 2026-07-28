package fr.yeensight.yeensender.network.core.repository;

import fr.yeensight.yeensender.network.core.entity.NetworkEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface NetworkRepository extends MongoRepository<NetworkEntity, String> {

	Optional<NetworkEntity> findByIdNetwork(String idNetwork);

	boolean existsByIdNetwork(String idNetwork);

	List<NetworkEntity> findByNameContainingIgnoreCase(String name);

	List<NetworkEntity> findByCreatedAtBetween(LocalDateTime start, LocalDateTime end);
}
