package de.churl.videorandomizer.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("videos")
data class Video (

    @Id
    val id: String,

    val url: String
)
