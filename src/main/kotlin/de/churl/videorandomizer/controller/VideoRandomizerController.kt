package de.churl.videorandomizer.controller

import de.churl.videorandomizer.model.Video
import de.churl.videorandomizer.repository.VideoRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class VideoRandomizerController(
    val videoRepository: VideoRepository
) {

    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("videos", videoRepository.findAll())
        return "index";
    }

    @PostMapping("/add")
    fun addLink(@RequestParam videourl: String): String {
        videoRepository.save(Video(videourl))
        return "redirect:/"
    }
}
