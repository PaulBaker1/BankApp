import java.util.Random;
import java.util.Scanner;

class CreatAccount {

    Scanner in = new Scanner(System.in);

    Random rand = new Random();
    private int accountNumber = rand.nextInt(1000000);
    private String userName;
    private String userSurname;
    private String userLogin;
    private double balance;
    private int userPin;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserLogin(String userLogin) { this.userLogin = userLogin; }

    public String getUserLogin() { return userLogin; }

    public void setBalance() { this.balance = balance; }

    public double getBalance() { return balance; }

    public void setUserPin(int userPin) { this.userPin = userPin; }

    public double getUserPin() { return userPin; }


    public void makeAccount() {
        System.out.println("Enter the Users Name: ");
        userName = in.nextLine();
        System.out.println("Enter the Users Surname: ");
        userSurname = in.nextLine();
        System.out.println("Enter the Users UsersName: ");
        userLogin = in.nextLine();
        System.out.println("Enter the Users Pin");
        userPin = in.nextInt();
        System.out.println("Enter the Users Balance: ");
        balance = in.nextDouble();
        System.out.println("Thank you for making the account!");
    }

    public void showUserData() {
        System.out.println("Users Name: " + userName);
        System.out.println("Users Surname: " + userSurname);
        System.out.println("Users UserName: " + userLogin);
        System.out.println("Users Accounts Number: " + accountNumber);
        System.out.println("Users Pin: " + userPin);
        System.out.println("Users Account Balance " + balance);
    }
}

class AccountName extends CreatAccount {

    Scanner in = new Scanner(System.in);

    CreatAccount creatAccount = new CreatAccount();
    // Prywatne dane uzytkownika

    public String userName; //= "Paul";
    public String userSurname;
    public String inputLogin;
    public String accountIdNumber; //= "ABCD";
    public String userId;

    public void accessAccount() {
        System.out.println("Enter Login: ");
        inputLogin = in.nextLine();
    }
    void checkName() {
        if (userName.equals(creatAccount.getUserName()))
            System.out.println("Correct Name");
        else {
            System.out.println("You entered wrong Name");
            System.exit(0);
        }
    }
    void checkSurname() {
        if (userSurname.equals(creatAccount.getUserSurname()))
            System.out.println("Correct Name");
        else {
            System.out.println("You entered wrong Name");
            System.exit(0);
        }
    }
}


class AccountPin {
    AccountName accountName = new AccountName();
    Scanner in = new Scanner(System.in);

    public int userPin;
    public int pin = 1234;

    void checkPin() {
        System.out.println("Please enter PIN: ");
        userPin = in.nextInt();
        if (pin == accountName.getUserPin())
            System.out.println("Your PIN is correct");
        else {
            System.out.println("You entered wrong PIN");
            System.exit(0);
        }
    }
}

class AccountBalance {
    CreatAccount creatAccount = new CreatAccount();
    Scanner in = new Scanner(System.in);

    double balance = creatAccount.getBalance();
    double amt;

    public void showFunds() {
        System.out.println("Current balance " + balance);
    }
    public void deposit()  {
        System.out.println("Current balance " + balance + " Enter the amount you want to deposit: ");
        amt = in.nextDouble();
        if(amt > 0) {
            balance = amt + balance;
            System.out.println("Current balance now is: " + balance);
        } else {
            System.out.println("Please deposit correct amount");
        }
    }
    public void withdraw() {
        System.out.println("Current balance " + balance + " Enter the amount you want to withdraw: ");
        amt = in.nextDouble();
        if(balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdraw: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tInput correct amount");
        }
    }

}

/*class AccountLogin extends AccountName {
    public String name = "Paul";
    public String surname = "Baker";
    void checkName() {
        if (name.equals(getAccountName()))
            System.out.println("Correct Name");
        else {
            System.out.println("You entered wrong Name");
            System.exit(0);
        }
    }
    void checkSurname() {
        if (surname.equals(getAccountName()))
            System.out.println("Correct Surname");
        else {
            System.out.println("You entered wrong Surname");
            System.exit(0);
        }
    }
}
 */

/* class AccountPassword extends AccountPin {
    public int pin = 123;
    public int pin1 = 123;
    void checkPin() {
        if (pin != getAccountPin())
            System.out.println("Your PIN is correct");
        else {
            System.out.println("You entered wrong PIN");
            System.exit(0);
        }
    }
} */

/* class FundsBank extends AccountBalance{
    public long accountBalance = 5000;
}

class Deposit extends FundsBank {

    public long money1(long addBalance)   {
        return addBalance + accountBalance;
    }
}

class Withdraw extends FundsBank {
    public long money2(long subBalance) {
        return accountBalance - subBalance;
    }
} */

/*class TakeALoan {

}

class Exchange {

}*/

public class Bank {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CreatAccount creatAccount = new CreatAccount();
        AccountName accountName = new AccountName();
        AccountPin accountPin = new AccountPin();
        AccountBalance accountBalance = new AccountBalance();

        int input1;
        do {
            System.out.println("Welcome to the Bank Application!");
            System.out.println("First steps ");
            System.out.println("Create an account: [1]");
            System.out.println("Show user data: [2]");
            System.out.println("Log in into account: [3]");
            System.out.println("Account Operations: [4]");
            System.out.println("To exit the program: [5]");
            input1 = in.nextInt();
            switch (input1) {
                case 1:
                    creatAccount.makeAccount();
                    break;
                case 2:
                    creatAccount.showUserData();
                    break;
                case 3:
                    accountName.accessAccount();
                    accountPin.checkPin();
                case 4:
                    System.out.println("What would you like to do next? ");
                    System.out.println("Check your current funds: [1]");
                    System.out.println("Deposit your funds: [2]");
                    System.out.println("Withdraw your funds: [3]");
                    System.out.println("Main menu: [4]");
                    System.out.println("To exit the program: [5]");
                    int input2;
                    do {
                        input2 = in.nextInt();
                        switch (input2) {
                            case 1:
                                accountBalance.showFunds();
                                break;
                            case 2:
                                accountBalance.deposit();
                                break;
                            case 3:
                                accountBalance.withdraw();
                                break;
                            case 4:
                                break;
                            case 5:
                                System.out.println("See you soon!");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Please enter correct number!");
                        }
       /* AccountName accountName = new AccountName();
        AccountName accountSurname = new AccountName();
        AccountPin accountPin = new AccountPin();
        AccountBalance accountBalance = new AccountBalance();
        AccountLogin accountLogin = new AccountLogin();
        AccountPassword accountPassword = new AccountPassword();
        FundsBank fundsBank = new FundsBank();
        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();



        /*System.out.println("Enter your Name: ");
        // setAccountName uzywa obiektu accountBank i klasy Scanner
        // do pobierania imienia uzytkownika
        accountName.setAccountName(in.nextLine());
        accountLogin.checkName();
        System.out.println("Enter your Surname: ");
        accountSurname.setAccountName(in.nextLine());
        accountLogin.checkSurname();

        System.out.println("Enter your pin: ");
        accountPin.setAccountPin(in.nextInt());
        accountPassword.checkPin();

        System.out.println("Hello " + accountName.getAccountName() + " " + accountSurname.getAccountName());
        System.out.println("Your current balance is: " + fundsBank.accountBalance);

        System.out.println("How much would you like to deposit? ");
        // double moneyDeposit = deposit.money(in.nextDouble());
        System.out.println("Your new balance is: " + deposit.money1(in.nextLong()));

        System.out.println("How much would you like to withdraw? ");
        System.out.println("Your new balance is: " + withdraw.money2(in.nextLong()));
*/
        /* System.out.println("What would you like to do next: ");
        System.out.println("Check Account Funds:  [1]");
        System.out.println("Deposit Funds: [2]");
        System.out.println("Withdraw Funds: [3]");
        System.out.println("Take a loan: [4]");
        System.out.println("Exchange money into foreign currency: [5]");
        System.out.println("Exit: [6]"); */
                    }while(input2 != 5);
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Please enter correct number!");
            }
        } while(input1 != 5);

        /*accountBalance.deposit();
        accountBalance.withdraw();*/
       /* System.out.println("\n ***Bank App*** \n");
        System.out.println("Please log in!");
        accountName.accessAccount();
        accountPin.checkPin();*/


    }
}
