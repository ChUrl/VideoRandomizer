package de.churl.videorandomizer.controller

import de.churl.videorandomizer.model.Video
import de.churl.videorandomizer.repository.VideoRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class VideoRandomizerApiController(
    val videoRepository: VideoRepository
) {

    @GetMapping("/find-all")
    fun findAll(): List<Video> {
        return videoRepository.findAll()
    }
}
