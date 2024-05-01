package Task1;

import java.util.ArrayList;
public class UserListProcessor {
    private ArrayList<User> users;

    public UserListProcessor(ArrayList<User> users) {
        this.users = users;
    }

    public void processUserList() {
        for (User user : users) {
            processUser(user);
        }
    }

    public int countAdminUsers() {
        return (int) users
                .stream()
                .filter(this::isAdmin)
                .count();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendEmailToUser(Email email) {
        System.out.println("Sending email to user: " + email.email());
    }

    private boolean isAdmin(User user) {
        return user.email().username().contains("admin");
    }

    private void processUser(User user) {
        System.out.println("Processing user: " + user);
        if (isAdmin(user)) {
            System.out.println("Admin user detected!");
        }
    }
}
