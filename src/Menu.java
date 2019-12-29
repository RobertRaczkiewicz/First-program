import java.util.Scanner;

public class Menu {

    int choose;
    int chooseWithd;

    public int choose()
    {
        System.out.println("Please, choose what you want to do:");
        System.out.println("1 - Withdraw");
        System.out.println("2 - Deposit");
        System.out.println("3 - Complete");
        Scanner scanner= new Scanner(System.in);
        int option= scanner.nextInt();
        return option;

    }

    public int chooseWithd()
    {
        System.out.println("Please, choose what you want to do:");
        System.out.println("1 - Check balance");
        System.out.println("2 - Withdraw");
        System.out.println("3 - Change PIN");
        Scanner scanner= new Scanner(System.in);
        int option= scanner.nextInt();
        return option;
    }


}

