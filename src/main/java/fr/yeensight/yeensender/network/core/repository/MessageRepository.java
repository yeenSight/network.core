package fr.yeensight.yeensender.network.core.repository;

import fr.yeensight.yeensender.network.core.entity.MessageEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MessageRepository extends MongoRepository<MessageEntity, String> {

	List<MessageEntity> findByIdSource(Long idSource);

	List<MessageEntity> findByIdTargetsContains(Long idTarget);

	List<MessageEntity> findByCreatedAtBetween(LocalDateTime start, LocalDateTime end);

	List<MessageEntity> findByTitleContainingIgnoreCase(String title);
}
