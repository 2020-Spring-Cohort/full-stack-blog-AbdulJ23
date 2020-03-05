package org.wcci.blog.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.Models.Post;
import org.wcci.blog.Storage.Repistories.PostRepository;

@Controller
public class PostsController {
    @Autowired
    private PostRepository postRepository;

    @RequestMapping("/posts/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        Post post = postRepository.findById(id);
        model.addAttribute("post", post);
        return "posts/view";
    }
}