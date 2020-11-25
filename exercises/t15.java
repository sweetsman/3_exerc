package exercises;
import java.util.Scanner;
public class t15 {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 900)+100; //随机生成100-999之间的数
        //Math.random()来获得一个0.0到1.0之间的伪随机数的double值，可以取到0 ，但不包括1。
        Scanner input = new Scanner(System.in);//调用Scanner类创建对象
        System.out.print("Enter your lottry pick (two digits):");

        int guess = input.nextInt();

        //Get digits from lottry
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery / 10 %10;
        int lotteryDigit3 = lottery %10;

        //Get digits from guess

        int guessDigit1 = guess / 100;
        int guessDigit2 = guess / 10 % 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is :" + lottery);

        if(guess == lottery)
        {
            System.out.println("Exact match: you win $10,000");

        }
        else if(guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2||
                guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3||
                guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1||
                guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2||
                guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
            System.out.println("Match all digits: you win $3,000");
        else  if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3||
                guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3||
                guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry,no match");
    }
}
