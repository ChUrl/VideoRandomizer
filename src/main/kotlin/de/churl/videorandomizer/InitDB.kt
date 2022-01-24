package de.churl.videorandomizer

import de.churl.videorandomizer.model.Video
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

        videoRepository.saveAll(listOf(
            Video("1", "1.com"),
            Video("2", "2.com"),
            Video("3", "3.com"),
            Video("4", "4.com"),
            Video("5", "5.com")
        ))
        run = true
    }
}
