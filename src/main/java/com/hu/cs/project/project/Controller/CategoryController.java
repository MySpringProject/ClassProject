package com.hu.cs.project.project.Controller;
import com.hu.cs.project.project.Model.Categories;
import com.hu.cs.project.project.Services.CateguryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CategoryController {

    @Autowired
    private CateguryService categuryService;

    @GetMapping("/category/add")
    public String getAddCategory(Model model){
        model.addAttribute("category", new Categories());
        return "Categories_add";
    }


    @PostMapping("/category/add")
    public String GetCateguryList(@ModelAttribute Categories categories){
        categuryService.saveCategury(categories);
        return "redirect:/category/List";
    }

    @RequestMapping(path = {"/category/List", "categurys"})
    public String getCateguryListPage(Model model){
        model.addAttribute("categurys", categuryService.findAll());
        return "ListofCategury";
    }
    @GetMapping("/category/edit/{id}")
    public String editCategury(@PathVariable Long id, Model model){
        Categories categories = categuryService.findCateguryById(id);
        model.addAttribute("categur", categories);
        return "Categories_add";
    }
    @PostMapping("/category/delete/{id}")
    public String deleteCategury(@PathVariable Long id){
        categuryService.deleteCateguryById(id);
        return "redirect:/categurys";
    }

}
