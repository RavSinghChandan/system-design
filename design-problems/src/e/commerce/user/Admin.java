package e.commerce.user;

class Admin extends User {

    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDetails() {
        System.out.println("Admin: " + getName() + " (" + getEmail() + ")");
    }
}
