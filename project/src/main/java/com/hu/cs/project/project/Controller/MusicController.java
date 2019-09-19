package com.hu.cs.project.project.Controller;

import com.hu.cs.project.project.Model.Musics;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusicController {
    @GetMapping("/music/addmusic")
    public String getAddMusic(Model model){
        model.addAttribute("music", new Musics());
        return "Musics_add";
    }
}
