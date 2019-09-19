package com.hu.cs.project.project.Controller;

import com.hu.cs.project.project.Model.Categories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    @GetMapping("/category/addcategory")
    public String getAddCategory(Model model){
        model.addAttribute("category", new Categories());
        return "Categories_add";
    }
}
