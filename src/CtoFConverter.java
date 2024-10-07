import com.sun.javafx.image.BytePixelSetter;

import java.util.Scanner;
public class CtoFConverter
{ public static void main(String[] args)
    {Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0.0;
        String trash = "";
        boolean tempDone = false;

      do {

            System.out.println("Enter tempurature in celsius: ");

             if (scanner.hasNextDouble())
            {
                celsius = scanner.nextDouble();
                fahrenheit = celsius * 9 / 5 + 32;
                System.out.println("The temperature in Fahrenheit is " + fahrenheit);
                tempDone = false;
            }
            else
            {
                trash = scanner.nextLine();
                System.out.println("Please enter a valid temperature.");
                tempDone = true;
            }
     }while(!tempDone);
    }
}