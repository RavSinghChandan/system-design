package cor.email;

public class SpamFilter extends EmailFilter{
    @Override
    public void filter(Email email) {
        if (email.getContent().toLowerCase().contains("buy now") || email.getContent().toLowerCase().contains("lottery")) {
            email.setCategory("Spam");
        } else {
            super.filter(email);
        }
    }
}
