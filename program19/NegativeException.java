import java.util.Scanner;


class NegativeNumberException extends Exception
{
    public NegativeNumberException(String message)
    {
        super(message);
    }
}

public class NegativeException

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, num;
        int sum = 0;

        System.out.println("Enter number:");
        n = sc.nextInt();

        try
        {
            for (int i = 1; i <= n; i++)
            {
                System.out.println("Enter number " + i + ":");
                num = sc.nextInt();

                if (num < 0)
                {
                    throw new NegativeNumberException("Negative number not alowed");
                }

                sum += num;
            }

            double avg = (double) sum / n;
            System.out.println("Average = " + avg);
        }
        catch (NegativeNumberException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
