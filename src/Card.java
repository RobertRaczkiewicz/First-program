import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Card {

    int card;
    int pin;
    int a,b;

    public int card()
    {
        System.out.println("Please, choose which card you want to use:");
        System.out.println("1 - Millennium debit card");
        System.out.println("2 - Millennium credit card - Impresja");
        System.out.println("3 - Millennium credit card - Alfa");
        Scanner scanner= new Scanner(System.in);
        int card= scanner.nextInt();
        switch (card)
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
        return card;
    }
    int memoryPin(int a) throws FileNotFoundException {
        int memPin1;
        int memPin2;
        int memPin3;
        File file = new File("pin.txt");
        Scanner scanner = new Scanner(file);
        memPin1 = scanner.nextInt();
        memPin2 = scanner.nextInt();
        memPin3 = scanner.nextInt();
        if (a == 1) {
            return memPin1;
        } else if (a == 2) {
            return memPin2;
        } else {
            return memPin3;
        }
    }

    int pinVerification(int b) {
        int accept=1;
        System.out.println("Please enter your PIN number:");
        Scanner scanner=new Scanner(System.in);
        int pin=scanner.nextInt();
        if (b==pin){
            System.out.println("PIN is correct!");
            return accept;
        }
        else{
            System.out.println("Your PIN is incorrect !!! Try again !");
            System.out.println("Please enter your PIN number:");
            pin=scanner.nextInt();
            if (b==pin){
                System.out.println("PIN is correct!");
                return accept;
            }
            else {
                System.out.println("Your PIN is incorrect !!! Try again !");
                System.out.println("Please enter your PIN number:");
                pin=scanner.nextInt();
                if (b==pin){
                    System.out.println("PIN is correct!");
                    return accept;
                }
                else{
                    System.out.println("Your PIN is incorrect !!!");
                    System.out.println("Your card is blocked !!!");
                    System.out.println("Contact your Bank");
                    int blocked=2;
                    return blocked;

                }
            }
        }



    }

}

