package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "wikimedia_recent_change")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Lob
    @Column(name = "wiki_event_data")
    private String wikiEventData;

}