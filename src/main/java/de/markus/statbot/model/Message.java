package de.markus.statbot.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
public class Message {

    @Id
    private Long message_id;
    private Integer length;
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "user_Id", nullable = false, updatable = false)
    private User author;

    @ManyToOne
    @JoinColumn(name = "messages", updatable = false)
    private Channel channel_Id;

    protected Message() {
    }

    public Message(Long message_id, Integer length, User author, Date creationDate, Channel channel_Id) {
        this.message_id = message_id;
        this.length = length;
        this.author = author;
        this.creationDate = creationDate;
        this.channel_Id = channel_Id;
    }
}
