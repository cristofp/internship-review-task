package pl.phronimos.internship.postPage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.phronimos.internship.postPage.service.PostService;

@Controller
public class MainViewController {

    @Autowired
    private PostService postService;

    @GetMapping(value = {"/mainView", "/"})
    public String mainView(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "mainView";
    }
}
