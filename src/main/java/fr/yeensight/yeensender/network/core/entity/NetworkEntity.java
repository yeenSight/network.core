package fr.yeensight.yeensender.network.core.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "networks")
public class NetworkEntity {

	@Id
	private String id;

	private String name;

	/**
	 * The key must be stored already encrypted before persistence.
	 */
	private String key;

	@Indexed(unique = true)
	@Field("id_network")
	private String idNetwork;

	@CreatedDate
	@Field("created_at")
	private LocalDateTime createdAt;

	public NetworkEntity() {
	}

	public NetworkEntity(String name, String key, String idNetwork) {
		this.name = name;
		this.key = key;
		this.idNetwork = idNetwork;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getIdNetwork() {
		return idNetwork;
	}

	public void setIdNetwork(String idNetwork) {
		this.idNetwork = idNetwork;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "NetworkEntity{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", key='" + key + '\'' +
				", idNetwork='" + idNetwork + '\'' +
				", createdAt=" + createdAt +
				'}';
	}
}
