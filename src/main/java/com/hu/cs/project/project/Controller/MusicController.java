package com.hu.cs.project.project.Controller;

import com.hu.cs.project.project.Model.Musics;
import com.hu.cs.project.project.Services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/music/add")
    public String getAddMusic(Model model){
        model.addAttribute("music", new Musics());
        return "Musics_add";
    }

        @PostMapping("/music/add")
        public String getMusic(@ModelAttribute Musics musics){
            musicService.saveMusics(musics);
            return"redirect:/music/list";

    }

    @RequestMapping("/music/list")
    public String getMusicListPage(Model model){
        model.addAttribute("musics" , musicService.findAll());
        return "music-list";

    }
     @GetMapping("/music/edit/{id}")
    public String edit(@PathVariable Long id , Model model){
        Musics musics = musicService.editMusicById(id);
        model.addAttribute("music" , musics);
        return "music/add";

     }

     @PostMapping("/music/delete/{id}")
    public String delete(@PathVariable Long id , Model model){
         musicService.deleteMusicById(id);
         return "redirect:/music";
     }



}
