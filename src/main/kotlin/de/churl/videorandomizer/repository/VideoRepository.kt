package de.churl.videorandomizer.repository

import de.churl.videorandomizer.model.Video
import org.springframework.data.mongodb.repository.MongoRepository

interface VideoRepository: MongoRepository<Video, String>
