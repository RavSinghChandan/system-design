package cor.email;

public class SocialFilter extends EmailFilter{
    @Override
    public void filter(Email email) {
        if (email.getContent().toLowerCase().contains("friend request") || email.getContent().toLowerCase().contains("liked your post")) {
            email.setCategory("Social");
        } else {
            super.filter(email);
        }
    }
}
