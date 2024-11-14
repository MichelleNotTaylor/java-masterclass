import model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("Name: " + customer.getName());
        System.out.println("Credit Limit: " + customer.getCreditLimit());
        System.out.println("Email: " + customer.getEmail());

        Customer customerTwo = new Customer("Jane Doe", "JaneDoe@email.com");
        System.out.println("Name: " + customerTwo.getName());
        System.out.println("Credit Limit: " + customerTwo.getCreditLimit());
        System.out.println("Email: " + customerTwo.getEmail());

        Customer customerThree = new Customer("Jane Doe", 500, "JaneDoe@email.com");
        System.out.println("Name: " + customerThree.getName());
        System.out.println("Credit Limit: " + customerThree.getCreditLimit());
        System.out.println("Email: " + customerThree.getEmail());
    }
}