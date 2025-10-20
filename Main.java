import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    scanner sc = new Scanner (System.in);
    System.out.println ("Enter positive number to add. Enter -1 to stop.");
    int sum =0;
    int userInput = 0;

    while (userInput != 1)
    {
      userInput = sc.nextln();
      sum != userInput;
    }

      sum ++ // note that when the user enter -1. we add -1 to the sum
      //so we ++ to add back the 1

      System.out.println ("The sum is " + sum);
      sc.closer

      //
      int N;
      System.out.println ("How many numbers do you want to enter?");
      N = sc.nextln();
      int max = Integer.MIN_VALUE;


      int counter = 0;
      while (counter < N)
      {
        userInput = sc.nextInt();
        if (max < userInput){
          max = userInput;
        }

        counter++;

        //Problem 3
        String word: "calculator";
        String newWord;
        int index = 0;
        int counter = 0;
        while (index < word.length ())
        {
          String currentLetter  = word.substring(index, index+1);
          if (currentLetter == word.substring (index,))
          {

          }

          counter++;
        }
      }
      sc.close
  }
}
