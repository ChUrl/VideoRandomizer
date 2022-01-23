package de.churl.videorandomizer

import de.churl.videorandomizer.repository.VideoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import javax.annotation.PostConstruct

@SpringBootApplication
//@EnableMongoRepositories
class VideoRandomizerApplication

fun main(args: Array<String>) {
	runApplication<VideoRandomizerApplication>(*args)
}


