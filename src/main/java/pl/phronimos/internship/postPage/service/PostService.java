package pl.phronimos.internship.postPage.service;

import org.springframework.stereotype.Service;
import pl.phronimos.internship.postPage.entity.PostEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PostService {

    private AtomicInteger postCounter = new AtomicInteger(1);
    private List<PostEntity> posts = new ArrayList<>();
    private CommentService commentService;

    public PostService(CommentService commentService) {
        this.commentService = commentService;
        posts.add(createPost("Java Coder","Hey, do you know if this service the one from internship task?"));
        posts.get(0)
                .addComment(commentService.createComment("Yes, that's it"))
                .addComment(commentService.createComment("Confirmed info"));

        posts.add(createPost("Spring Master Wannabe", "Oh, man it's quite difficult"));
        posts.get(1)
                .addComment(commentService.createComment("Indeed.... Good luck!"));
    }

    public PostEntity createPost(String author, String text){
        return new PostEntity(postCounter.getAndIncrement(), author, text);
    }

    public List<PostEntity> getAllPosts(){
        return posts;
    }
}
