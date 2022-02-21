package com.homelane.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tweet")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private int id;
    @Column(name = "created_at")

    private LocalDateTime createdAt;
    @Column(name = "text")
    private String text;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tweet_id")
    private List<Hashtag> hashtag;

}
