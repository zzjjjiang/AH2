import java.util.Scanner;

public class Solution
{
    public static boolean isPrime(int num)
    {
        for (int i = 2; i<= num/i; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return num > 1;
    }

    public static void main(String[] args)
    {
        int number;
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime? ");
        number = prime.nextInt();
        System.out.println(isPrime(number));
    }
}