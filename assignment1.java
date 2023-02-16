import java.util.*;
public class assignment1
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number.");
        int n=in.nextInt();
        if(n>0)
        System.out.println("It is a positive number");
        else if(n<0)
        System.out.println("It is a negative number");
        else if(n==0)
        System.out.println("0 is neither a negative integer nor a positive integer");
        else
        System.out.println("Invalid input");
    }
}