import java.util.*;
public class assignment2for {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int i=0;
        int sum=0;
        for(i=0;i<5;i++)
        {
            int n=in.nextInt();
            sum=sum+n;
        }
        System.out.println("Sum is="+sum);
    }
    
}
