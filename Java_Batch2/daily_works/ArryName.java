import java.util.Scanner;




public class ArrayName {

    public static void main(String args[])

    {

        Scanner sc=new Scanner(System.in);

        int size;

        System.out.println("enter the size");

        size=sc.nextInt();

        String arr[]=new String[size];

        System.out.println("enter the "+size+ " name");

        for(int i=0;i<arr.length;i++)

{

arr[i]=sc.next();



 }

for(int i=0;i<arr.length;i++)

 {

System.out.print(arr[i]+" ");

    }
 }


}




has context menu