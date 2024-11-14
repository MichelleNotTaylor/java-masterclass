import model.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123456789);
        bankAccount.setBalance(1000.00);
        bankAccount.setName("John Doe");
        bankAccount.setEmail("test@email.com");
        bankAccount.setPhoneNumber("123-456-7890");

        bankAccount.deposit(100.00);
    }
}