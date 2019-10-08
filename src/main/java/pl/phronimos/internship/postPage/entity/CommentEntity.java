package pl.phronimos.internship.postPage.entity;

public class CommentEntity {
    private int id;
    private String text;

    public CommentEntity() {
    }

    public CommentEntity(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
