import java.util.Scanner;
class Bank_Account {
    int accountNumber;
    String userName;
    String email;
    String accountType;
    double accountBalance;

    void getAccountDetails() {
        System.out.println("enter account details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Account number");
         accountNumber = sc.nextInt();

         System.out.println("userName");
         userName = sc.nextLine();
         
         System.out.println("email");
         email = sc.nextLine();

         System.out.println("Account type");
         accountType = sc.nextLine();

         System.out.println("Account balance");
         accountBalance = sc.nextInt();
    }
    void displayAccountDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Username: " + userName);
        System.out.println( "Email: " +email);
        System.out.println("Acc Type : " + accountType);
        System.out.println("Acc balance: " + accountBalance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        System.out.println("Welcome: ");
      Bank_Account acc1 = new Bank_Account();
      acc1.getAccountDetails();
      acc1.displayAccountDetails();
       
    }
    
}
