package de.churl.videorandomizer

import de.churl.videorandomizer.model.Video
import de.churl.videorandomizer.model.VideoList
import de.churl.videorandomizer.repository.VideoRepository
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class InitDB(
    val videoRepository: VideoRepository,
) {
    var run: Boolean = false  // only initialize database once

    @PostConstruct
    fun populateMongoDB() {
        if(run) return

        val videos: List<Video> = listOf(
            Video("1.com"),
            Video("2.com"),
            Video("3.com"),
            Video("4.com"),
            Video("5.com")
        )

        videoRepository.deleteAll()
        videoRepository.saveAll(videos)

        run = true
    }
}
