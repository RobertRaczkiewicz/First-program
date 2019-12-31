import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class Atm {

    public static void main(String[] args) throws FileNotFoundException {
        int number;
        int cardVer;
        int pinVer;
        int resultVeryfication;

        System.out.println("Welcome! Today is " + new Date());
        System.out.println("");

        do {
            Menu menu = new Menu();
            Card card = new Card();
            Card memoryPin= new Card();
            Card pinVerification= new Card();

            number=menu.chooseOption();
            if (number!=1 && number!=2)
            {
                System.out.println("Thank you for using our cash machine! See you soon...");
                break;
            }

            cardVer=card.card();
            pinVer=memoryPin.memoryPin(cardVer);

            resultVeryfication= pinVerification.pinVerification(pinVer);
            if (resultVeryfication==1){
                Menu mainMenu= new Menu();
                int loop = mainMenu.mainMenu(cardVer);
                if (loop==6){
                    break;
                }
            }
            else {
                break;
            }
        }while (number == 1 || number == 2);
    }
}
