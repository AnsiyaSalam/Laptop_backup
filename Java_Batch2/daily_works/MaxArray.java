import java.util.*;

class MaxArray{
public static void main(String []args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int size=sc.nextInt();
int arr[]=new int[size];
int max=0;
System.out.println("insert "+size+" number"); 
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
for(int s:arr){
if(s>max){
max=s;
}
}
System.out.println("Max: "+max);
}
}