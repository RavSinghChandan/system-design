package cor.email;

public class Email {
    private String content;
    private String category;

    public Email(String content) {
        this.content = content;
        this.category = "Uncategorized";
    }
    public Email(String strategy, String content) {
        this.category = strategy;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
