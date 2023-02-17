import java.util.*;
public class assignment2while {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int i=0;
        int sum=0;
        while(i<5)
        {
            int n=in.nextInt();
            sum=sum+n;
            i++;
            
        }
        System.out.println("Sum is="+sum);
    }
}
        

    
    

