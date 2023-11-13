import java.util.Scanner;

class Array{
public static void main(String []args){
Scanner sc=new Scanner(System.in);

int []numbers = new int[5];
System.out.println("Enter the 5 numbers");

for(int count=0; count<5; count++){
numbers[count]=sc.nextInt();
}

System.out.println("Enter the numbers are: ");
for(var num:numbers)
System.out.print(num+"\t");
}
}


