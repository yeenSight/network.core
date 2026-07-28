package fr.yeensight.yeensender.network.core.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "messages")
public class MessageEntity {

    /**
     * Message entity is the message that'll be manipulated through the different part of the app.
     * It need to be as generic as possible. It will keep a trace of each message sends.
     */
    @Id
    private String id;

    /**
     * title of the news/article
     */
    private String title;

    /**
     * Message content
     */
    private String content;

    /**
     * list of images to be send to the networks
     */
    private List<String> images;

    /**
     * source of the message. Used id_network
     */
    private Long idSource;

    /**
     * list of targets for the message. Used id_network
     */
    private List<Long> idTargets;

    /**
     * creation date
     */
    @CreatedDate
    private LocalDateTime createdAt;

    // ── Constructors ──────────────────────────────────────────────────────────

    public MessageEntity() {
    }

    public MessageEntity(String title, String content, List<String> images,
                         Long idSource, List<Long> idTargets) {
        this.title = title;
        this.content = content;
        this.images = images;
        this.idSource = idSource;
        this.idTargets = idTargets;
    }

    // ── Getters & Setters ─────────────────────────────────────────────────────

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Long getIdSource() {
        return idSource;
    }

    public void setIdSource(Long idSource) {
        this.idSource = idSource;
    }

    public List<Long> getIdTargets() {
        return idTargets;
    }

    public void setIdTargets(List<Long> idTargets) {
        this.idTargets = idTargets;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // ── toString ──────────────────────────────────────────────────────────────

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", images=" + images +
                ", idSource=" + idSource +
                ", idTargets=" + idTargets +
                ", createdAt=" + createdAt +
                '}';
    }
}

