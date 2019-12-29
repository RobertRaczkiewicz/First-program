import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class Atm {

    public static void main(String[] args) throws FileNotFoundException {
        int nr;
        int cardVer;
        System.out.println("Welcome! Today is " + new Date());
        System.out.println("");

        do {
            Menu menu = new Menu();
            int number=menu.choose();
            nr= number;
            if (number==3)
            {
                System.out.println("Thank you for using our cash machine! See you soon...");
                break;
            }
            Card card = new Card();
            int atm=card.card();
            cardVer= atm;
            switch (cardVer)
            {
                case 1:
                    System.out.println("You choose Millennium debit card");
                    break;
                case 2:
                    System.out.println("You choose Millennium credit card - Impresja");
                    break;
                case 3:
                    System.out.println("You choose Millennium credit card - Alfa");
                    break;
            }

            Card memoryPin= new Card();
            int pinVer=memoryPin.memoryPin(cardVer);

            Card pin= new Card();
            int resultVeryfication= pin.pin(pinVer);
            if (resultVeryfication==1){
                System.out.println("MENU:");
                System.out.println("1 - Withdraw");
                System.out.println("2 - Change PIN");
                System.out.println("3 - Last 5 transaction");
                System.out.println("4 - Balance");
                Scanner scanner=new Scanner(System.in);
                int nrMenu= scanner.nextInt();
            }
            else {
                break;
            }





        }while (nr == 1 || nr == 2);

    }
}
