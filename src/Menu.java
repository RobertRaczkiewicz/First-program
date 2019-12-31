import java.util.Scanner;

public class Menu {

    int choose;
    int chooseWithd;
    int cardVer;
    int nrMenu;

    public int chooseOption() {
        System.out.println("Please, choose what you want to do:");
        System.out.println("1 - Withdraw");
        System.out.println("2 - Deposit");
        System.out.println("3 - Complete");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        return option;
    }

    public int mainMenu(int cardVer) {
        do {
        System.out.println("Please, choose an option:");
        System.out.println("1 - Withdraw");
        System.out.println("2 - Change PIN number");
        System.out.println("3 - Print last 5 transaction");
        System.out.println("4 - Balance");
        System.out.println("5 - Back to start/ Main menu");
        System.out.println("6 - Complete");
        Scanner scanner = new Scanner(System.in);
        nrMenu=scanner.nextInt();

        switch (nrMenu) {
            case 1:
                SelectOption Withdraw = new SelectOption();
                Withdraw.withdraw();
                break;
            case 2:
                SelectOption ChangePin = new SelectOption();
                ChangePin.changePin();
                break;
            case 3:
                SelectOption PrintLast5 = new SelectOption();
                PrintLast5.printLast5();
                break;
            case 4:
                SelectOption Balance = new SelectOption();
                Balance.balance();
                break;
            case 5:
                break;

            case 6:
                System.out.println("Thank you for using our cash machine! See you soon...");
                break;
            }

        }
        while(nrMenu==1 || nrMenu==2 || nrMenu==3 || nrMenu==4);
        return nrMenu;

}

}

