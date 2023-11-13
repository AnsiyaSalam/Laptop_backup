import java.util.Scanner;

class Problem1
{
    public static String shortended(String s)
    {
        String a = " ";
        String str[] = s.split(" ");
        // for(int i=0; i<str.length; i++)
        // {
        //     a = a + str[i].charAt(0)+".";
        // }

        for(String k:str)
        {
            a=a+k.charAt(0)+".";
        }
        return a;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Problem1.shortended(s));
    }
}