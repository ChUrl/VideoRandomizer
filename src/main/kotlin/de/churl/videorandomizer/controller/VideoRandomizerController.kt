package de.churl.videorandomizer.controller

import de.churl.videorandomizer.repository.VideoRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class VideoRandomizerController(
    val videoRepository: VideoRepository
) {

    @GetMapping("/")
    fun index(model: Model): String {
        model.addAttribute("videos", videoRepository.findAll())
        return "index";
    }
}
