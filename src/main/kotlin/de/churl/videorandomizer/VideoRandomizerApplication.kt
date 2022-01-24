package de.churl.videorandomizer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
//@EnableMongoRepositories
class VideoRandomizerApplication

fun main(args: Array<String>) {
	runApplication<VideoRandomizerApplication>(*args)
}


