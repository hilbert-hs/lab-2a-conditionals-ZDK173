import java.util.Scanner;
public class Lottery
{
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("What are your powerball numbers? (One at at time.)");
  int num1 = scan.nextInt();
  int num2 = scan.nextInt();
  int num3 = scan.nextInt();
  int num4 = scan.nextInt();
  int num5 = scan.nextInt();
  int powNum = scan.nextInt();
  scan.close();
  compareLottery(num1, num2, num3, num4, num5, powNum);

} 
  public static void compareLottery(int _num1, int _num2, int _num3, int _num4, int _num5, int _powNum)
  {
    int prize = 0;
    int lotteryNum1 = (int) (Math.random() * 60 +1);
    int lotteryNum2 = (int) (Math.random() * 60 +1);
    int lotteryNum3 = (int) (Math.random() * 60 +1);
    int lotteryNum4 = (int) (Math.random() * 60 +1);
    int lotteryNum5 = (int) (Math.random() * 60 +1);
    int powerballNum = (int) (Math.random() * 40 +1);

     System.out.println("The winning combonation is " + lotteryNum1 +" "+ lotteryNum2 +" "+ lotteryNum3 +" "+ lotteryNum4 +" "+ lotteryNum5 +" "+ "Power Ball: " + powerballNum);
     System.out.println("");
     System.out.println("Your combonation is " + _num1 +" "+ _num2 +" "+ _num3 +" "+ _num4 +" "+ _num5 +" "+ "Power Ball: " +_powNum);

     if (_powNum == powerballNum)
     {
        prize += 500;
     }
     if (_num1 == lotteryNum1)
     {
        prize += 50;
     }
     if (_num2 == lotteryNum2)
     {
        prize += 50;
     }
     if (_num3 == lotteryNum3)
     {
        prize += 50;
     }
     if (_num4 == lotteryNum4)
     {
        prize += 50;
     }
     if (_num5 == lotteryNum5)
     {
        prize += 50;
     }
     
     if (prize > 0)
     {
      System.out.println("Congratulations! Your prize is $" + prize);
     }
     else
     {
      System.out.println("Sorry you did not win.");
     }
    }

}



