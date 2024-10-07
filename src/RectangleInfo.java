import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       double width =0;
       double height = 0;
       double area = 0;
       double perimeter = 0;
       double diagonal = 0;
       String trash = "";
       boolean recDone = false;

       do
       {
           System.out.print("Enter width of the rectangle: ");
          if(in.hasNextDouble())
          {
              width = in.nextDouble();
              recDone = true;
          }
          else
          {
              trash = in.next();
              System.out.println("Invalid input, " + trash + " is not a valid number.");
              System.out.println("Please try again.");
          }
       } while(!recDone);
       System.out.print("Enter height of the rectangle: ");
       if(in.hasNextDouble())
       {
           height = in.nextDouble();
           recDone = true;
       }
       else
       {
           trash = in.next();
           System.out.println("Invalid input, " + trash + " is not a valid number.");
           System.out.println("Please try again.");
       }while(!recDone);

       area = (width*height);
       perimeter = 2*(width+height);
       diagonal = Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagonal);

    }
}
