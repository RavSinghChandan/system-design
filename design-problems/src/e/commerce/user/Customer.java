package e.commerce.user;

class Customer extends User {

    public Customer(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDetails() {
        System.out.println("Customer: " + getName() + " (" + getEmail() + ")");
    }
}
