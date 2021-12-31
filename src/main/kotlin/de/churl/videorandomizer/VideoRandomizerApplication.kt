package de.churl.videorandomizer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VideoRandomizerApplication

fun main(args: Array<String>) {
	runApplication<VideoRandomizerApplication>(*args)
}
