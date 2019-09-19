package com.hu.cs.project.project.Controller;

import com.hu.cs.project.project.Model.Albums;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {
    @GetMapping("/albums/add")
    public String getAddAlbum(Model model){
        model.addAttribute("album", new Albums());
        return "Albums_add";
    }
}
