package ModelDrivenArchitecture;

import ModelDrivenArchitecture.AccountFactory.Account1ConcreteFactory;
import ModelDrivenArchitecture.AccountFactory.Account2ConcreteFactory;
import ModelDrivenArchitecture.Accounts.Account1;
import ModelDrivenArchitecture.Accounts.Account2;

import java.util.Scanner;

public class Driver {

    private static final String SELECT_OPERATION = "Select Operation";

    public static void main(String[] args) {


        System.out.println("Select Account-1 or Account 2");
        System.out.println("Accounts Available:");
        System.out.println();
        System.out.println("1. Account-1 ");
        System.out.println("2. Account-2 ");
        System.out.println();

        accountSelection();


    }

    public static boolean accountSelection(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select ACCOUNT: ");
        int accountId = scanner.nextInt();

        if (accountId ==1){
            System.out.println("Account 1");
            System.out.println("Menu of Operations");
            System.out.println("0. Open(int,int,int)");
            System.out.println("1. login(int)");
            System.out.println("2. pin(int)");
            System.out.println("3. deposit(int)");
            System.out.println("4. withdraw(int)");
            System.out.println("5. balance()");
            System.out.println("6. logout()");
            System.out.println("7. lock(int)");
            System.out.println("8. unlock(int)");
            System.out.println("9. Quit the demo program");

            System.out.println("Please make a note of these operations");
            Account1ConcreteFactory account1ConcreteFactory = new Account1ConcreteFactory();
            Account1 account1 = new Account1(1,account1ConcreteFactory);

            if (recursiveAccount1(account1)){
                return true;
            }

        }

        else if (accountId==2){
            System.out.println("Account 2");
            System.out.println("Menu of Operations");
            System.out.println("0. OPEN(int,int,float )");
            System.out.println("1. LOGIN(y)");
            System.out.println("2. PIN(int)");
            System.out.println("3. DEPOSIT(float)");
            System.out.println("4. WITHDRAW(float)");
            System.out.println("5. BALANCE()");
            System.out.println("6. LOGOUT()");
            System.out.println("7. suspend()");
            System.out.println("8. activate()");
            System.out.println("9. close()");
            System.out.println("10. Quit the demo program");


            System.out.println("Please make a note of these operations");
            Account2ConcreteFactory account2ConcreteFactory = new Account2ConcreteFactory();
            Account2 account2 = new Account2(2,account2ConcreteFactory);

            if (recursiveAccount2(account2)){
                return true;
            }
        }
        else{
            System.out.println("Please enter a valid account id");
            System.out.println();
            return accountSelection();
        }
        return true;
    }

    public static boolean recursiveAccount1(Account1 account1){
        Scanner scanner = new Scanner(System.in);
        account1Operations();
        int operationId = scanner.nextInt();
        switch (operationId){
            case 0:
            {
                System.out.println("Operation :Open(int p,int y,int a)");
                System.out.println("Enter value of parameter p: ");
                int p = scanner.nextInt();

                System.out.println("Enter value of parameter y: ");
                int y = scanner.nextInt();

                System.out.println("Enter value of parameter a: ");
                int a = scanner.nextInt();

                account1.open(p,y,a);
                break;
            }
            case 1:
            {
                System.out.println("Operation :login(int y)");
                System.out.println("Enter value of parameter y: ");
                int y = scanner.nextInt();
                account1.login(y);
                break;
            }
            case 2:
            {
                System.out.println("Operation :pin(int x)");
                System.out.println("Enter value of parameter x: ");
                int x = scanner.nextInt();
                account1.pin(x);
                break;
            }
            case 3:
            {
                System.out.println("Operation :deposit(int d)");
                System.out.println("Enter value of parameter d: ");
                int d = scanner.nextInt();
                account1.deposit(d);
                break;
            }
            case 4:
            {
                System.out.println("Operation :withdraw(int w)");
                System.out.println("Enter value of parameter w: ");
                int w = scanner.nextInt();
                account1.withdraw(w);
                break;
            }
            case 5:
            {
                System.out.println("Operation :balance()");
                account1.balance();
                break;
            }
            case 6:
            {
                System.out.println("Operation :logout()");
                account1.logout();
                break;
            }
            case 7:
            {
                System.out.println("Operation :lock(int x)");
                System.out.println("Enter value of parameter x: ");
                int x = scanner.nextInt();
                account1.lock(x);
                break;
            }
            case 8:
            {
                System.out.println("Operation :unlock(int x)");
                System.out.println("Enter value of parameter x: ");
                int x = scanner.nextInt();
                account1.unlock(x);
                break;
            }
            case 9:
            {
                return true;
            }
            default:{
                System.out.println("Enter a valid Operation");
                return recursiveAccount1(account1);
            }

        }

        return recursiveAccount1(account1);
    }

    public static boolean recursiveAccount2(Account2 account2) {
        Scanner scanner = new Scanner(System.in);
        account2Operations();
        int operationId = scanner.nextInt();
        switch (operationId){
            case 0:
            {
                System.out.println("Operation :OPEN(int p,int y, float a)");
                System.out.println("Enter value of parameter p: ");
                int p = scanner.nextInt();

                System.out.println("Enter value of parameter y: ");
                int y = scanner.nextInt();

                System.out.println("Enter value of parameter a: ");
                float a = scanner.nextFloat();

                account2.OPEN(p,y,a);
                break;
            }
            case 1:
            {
                System.out.println("Operation :LOGIN(int y)");
                System.out.println("Enter value of parameter y: ");
                int y = scanner.nextInt();
                account2.LOGIN(y);
                break;
            }
            case 2:
            {
                System.out.println("Operation :PIN(int x)");
                System.out.println("Enter value of parameter x: ");
                int x = scanner.nextInt();
                account2.PIN(x);
                break;
            }
            case 3:
            {
                System.out.println("Operation :DEPOSIT(float d)");
                System.out.println("Enter value of parameter d: ");
                float d = scanner.nextFloat();
                account2.DEPOSIT(d);
                break;
            }
            case 4:
            {
                System.out.println("Operation :WITHDRAW(float w)");
                System.out.println("Enter value of parameter w: ");
                float w = scanner.nextFloat();
                account2.WITHDRAW(w);
                break;
            }
            case 5:
            {
                System.out.println("Operation :BALANCE()");
                account2.BALANCE();
                break;
            }
            case 6:
            {
                System.out.println("Operation :LOGOUT()");
                account2.LOGOUT();
                break;
            }
            case 7:
            {
                System.out.println("Operation :suspend(int x)");
                account2.suspend();
                break;
            }
            case 8:
            {
                System.out.println("Operation :activate()");
                account2.activate();
                break;
            }
            case 9:
            {
                System.out.println("Operation :close()");
                account2.close();
                break;
            }
            case 10:
            {
                return true;
            }
            default:{
                System.out.println("Enter a valid Operation");
                return recursiveAccount2(account2);
            }

        }
        return recursiveAccount2(account2);
    }

    public static void account1Operations(){
        System.out.println(SELECT_OPERATION);
        System.out.println("0-open, 1-login, 2-pin, 3-deposit, 4-withdraw, 5-balance, 6-logout, 7-lock, 8-unlock");
    }

    public static void account2Operations(){
        System.out.println(SELECT_OPERATION);
        System.out.println("0-open, 1-login, 2-pin, 3-deposit, 4-withdraw, 5-balance, 6-logout, 7-suspend, 8-activate, 9-close");
    }
}
