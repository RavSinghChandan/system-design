package cor.email;

public class PromotionsFilter extends EmailFilter{
    @Override
    public void filter(Email email) {
        if (email.getContent().toLowerCase().contains("discount") || email.getContent().toLowerCase().contains("sale")) {
            email.setCategory("Promotions");
        } else {
            super.filter(email);
        }
    }
}
