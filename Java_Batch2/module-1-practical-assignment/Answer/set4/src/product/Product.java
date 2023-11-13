package product;

import java.util.Scanner;

public class Product {

         public static double calculateFinalPrice(double basePrice) 
         {
             double finalPrice = basePrice;
             if (basePrice > 100) 
             {
                  finalPrice = finalPrice - basePrice * 0.1; 
             }
             if (basePrice > 500) 
             {
                 finalPrice = finalPrice - basePrice * 0.2; 
             }
             if (basePrice > 1000) 
             {	
                 finalPrice = finalPrice - basePrice * 0.3; 
             }
             if (basePrice > 5000) 
             {
                 finalPrice = finalPrice - basePrice * 0.4; 
             } 
             return finalPrice;
         }
         
         public static void main(String[] args) 
         {
        	 Scanner scanner = new Scanner(System.in);
             System.out.print("Enter the base price of the product: ");
             double basePrice = scanner.nextDouble();
             double finalPrice = calculateFinalPrice(basePrice);
             System.out.println("The final price of the product is: $" + finalPrice);
	 
         }
}

