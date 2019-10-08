package pl.phronimos.internship.postPage.service;

import org.springframework.stereotype.Service;
import pl.phronimos.internship.postPage.entity.CommentEntity;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CommentService {

    private AtomicInteger commentCounter = new AtomicInteger(1);

    public CommentEntity createComment(String text) {
        return new CommentEntity(commentCounter.getAndIncrement(), text);
    }
}
