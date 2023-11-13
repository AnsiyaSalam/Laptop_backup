class MultiArray{
public static void main(String []args){
//int [][]matrix = new int[3][3];
int [][]matrix={{2,3,5},{7,8,9},{12,13,15}};


//Enhanced for loop

for(int []row :matrix){
for(int value : row){
System.out.print("\t"+ value);
}
System.out.println();
}
}
} 