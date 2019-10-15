package com.hu.cs.project.project.Controller;

import com.hu.cs.project.project.Model.Albums;
import com.hu.cs.project.project.Services.AlbumServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AlbumController {
    @Autowired
    private AlbumServices albumServices;
    @GetMapping("/albums/add")
    public String getAddAlbum(Model model){
        model.addAttribute("album", new Albums());
        return "Albums_add";
    }
    @PostMapping("/albums/add")
    public String addAlbum(@ModelAttribute Albums album){
        albumServices.saveAlbum(album);
        return "redirect:/albums/albumList";
    }
    @RequestMapping(path = {"/albums/albumList", "albums"})
    public String getAlbums(Model model){
        model.addAttribute("albums", albumServices.findAll());
        return "ListofAlbums";
    }
    @GetMapping("album/edit/{id}")
    public String editAlbum(@PathVariable Long id, Model model){
        Albums album = albumServices.findAlbumById(id);
        model.addAttribute("album", album);
        return "Albums_add";
    }
    @PostMapping("album/delete/{id}")
    public String deleteAlbum(@PathVariable Long id){
        albumServices.deleteAlbumById(id);
        return "redirect:/albums";
    }


}
