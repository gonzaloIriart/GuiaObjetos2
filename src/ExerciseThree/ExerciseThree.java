package ExerciseThree;

public class ExerciseThree {
    public static void main(String[] args) {
        System.out.println("Exercise three\n");
        Client bankClient = new Client("Gonzalo", 'M');
        System.out.println(bankClient.toString());
        Account bankAccount = new Account(10000f, bankClient);
        System.out.println(bankAccount.toString());
        System.out.println("Deposit $ 5000");
        bankAccount.deposit(5000);
        bankAccount.showBalance();

        System.out.println("Extracting $ 2000");
        bankAccount.extract(2000);
        bankAccount.showBalance();

        System.out.println("Trying to extract $ 500000");
        bankAccount.extract(500000);
        bankAccount.showBalance();

        System.out.println("Negative balance");
        bankAccount.extract(14000);
        bankAccount.showBalance();

        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.deposit(5000);
        bankAccount.showBalance();
    }
}
