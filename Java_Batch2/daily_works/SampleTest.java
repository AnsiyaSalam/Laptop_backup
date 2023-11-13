import java.util.*;

public class SampleTest {
    public static void main(String []args)
    {
        System.out.println("Enter the values : ");
        Scanner sc=new Scanner(System.in);
      
        int num=sc.nextInt();
        int sum=0;

        while(num>0)
        {
            int temp=num%10;
            num=num/10;
            if(temp%2==0)
            {
                sum =sum+temp;
            }
        }

        System.out.println(sum);


    }
}
