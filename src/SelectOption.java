import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class SelectOption {

    public void withdraw(){
        System.out.println("Please, choose an amount:");
        System.out.println("1 - 10 $");
        System.out.println("2 - 20 $");
        System.out.println("3 - 50 $");
        System.out.println("4 - 100 $");
        System.out.println("5 - 200 $");
        System.out.println("6 - other amount");

        Scanner scanner = new Scanner(System.in);
        int nrAmount = scanner.nextInt();

        switch (nrAmount) {
            case 1:
                System.out.println("Your are withdraw 10 $");
                System.out.println("");
                break;
            case 2:
                System.out.println("Your are withdraw 20 $");
                System.out.println("");
                break;
            case 3:
                System.out.println("Your are withdraw 50 $");
                System.out.println("");
                break;
            case 4:
                System.out.println("Your are withdraw 100 $");
                System.out.println("");
                break;
            case 5:
                System.out.println("Your are withdraw 200 $");
                System.out.println("");
                break;
            case 6:
                System.out.println("Please enter amount");
                int amount = scanner.nextInt();
                System.out.println("Your are withdraw " + amount + " $");
                System.out.println("");
                break;
        }
    }

    public void changePin() {
        int i;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter new PIN number (four figure number)");
            int newPin1 = scanner.nextInt();
            System.out.println("Please repeat new PIN number (four figure number)");
            int newPin2 = scanner.nextInt();

            if (newPin1 == newPin2) {
                System.out.println("Your new PIN number is correct and save!");
                i = 1;
            } else {
                System.out.println("New PIN number is not the same !!!");
                System.out.println("Please try again!");
                System.out.println("");
                i = 2;
            }

        }
        while (i==2);
    }

    public void printLast5(){
        System.out.println("Last 5 transaction:");
        System.out.println("");
        System.out.println("30.12 - 11.38$ - Coffee Shop");
        System.out.println("30.12 - 50.00$ - Petrol Station");
        System.out.println("31.12 - 200.00$ - Withdraw ATM");
        System.out.println("31.12 - 70.00$ - Hairdressing Salon");
        System.out.println("31.12 - 15.15$ - TAXI");
        System.out.println("");
    }
    public void balance(){
        System.out.println("Your current balance is:");
        System.out.println("11 511 $");
    }
}
