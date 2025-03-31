package cor.email;

public class Client {
    public static void main(String[] args) {
        // Creating filters
        EmailFilter spamFilter = new SpamFilter();
        EmailFilter promotionsFilter = new PromotionsFilter();
        EmailFilter socialFilter = new SocialFilter();

        // Setting up the chain
        spamFilter.setNextFilter(promotionsFilter);
        promotionsFilter.setNextFilter(socialFilter);

        // Test emails
        Email email1 = new Email("Huge discount on your next purchase!");
        Email email2 = new Email("Congratulations! You've won a lottery.");
        Email email3 = new Email("John liked your post.");
        Email email4 = new Email("Team meeting scheduled for Monday.");

        // Filtering emails
        spamFilter.filter(email1);
        spamFilter.filter(email2);
        spamFilter.filter(email3);
        spamFilter.filter(email4);

        // Output results
        System.out.println("Email 1 categorized as: " + email1.getCategory());
        System.out.println("Email 2 categorized as: " + email2.getCategory());
        System.out.println("Email 3 categorized as: " + email3.getCategory());
        System.out.println("Email 4 categorized as: " + email4.getCategory());
    }
}
