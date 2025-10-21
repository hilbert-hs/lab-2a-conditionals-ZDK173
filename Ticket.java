
import java.util.Scanner;
public class Ticket
{

public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("What type of ticket would you like?");
  String seat = scan.nextLine();

  if ((seat.equals("B")) || (seat.equals("b")))
  {
    System.out.println("Your seat costs $75.");

  }
  else if ((seat.equals("P")) || (seat.equals("p")))
  {
    System.out.println("Your seat costs $30.");

  }
  else if ((seat.equals("L")) || (seat.equals("l")))
  {
    System.out.println("Your seat costs $21.");
  }  
  scan.close();
}
}
