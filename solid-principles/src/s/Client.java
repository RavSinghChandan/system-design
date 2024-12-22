package s;

import s.after.EmailService;
import s.after.UserService;

public class Client {

    public static void main(String[] args) {
        System.out.println("Before :============================");
        s.before.UserService userServiceBefore = new s.before.UserService();

        String userBefore = "Chandan Kumar Before";

        userServiceBefore.addUser(userBefore);
        userServiceBefore.sendEmail(userBefore);

        System.out.println("After :==============================");
        UserService userServiceAfter = new UserService();
        EmailService emailServiceAfter = new EmailService();

        String userAfter = "Chandan Kumar After";

        userServiceAfter.addUser(userAfter);
        emailServiceAfter.sendEmail(userAfter);

    }
}
