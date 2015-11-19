/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;;

/**
 *
 * @ayouzainy_027
 */
public class PrimeFactor {

  public static List<Integer> primeFactors(int number) {  
  int num =number ;  
  List<Integer> primeFactors = new ArrayList<Integer>();  
  for (int i = 2; i <= num; i++) {  
   while (num % i == 0) {  
    primeFactors.add(i);  
    num /= i;  
   }  
  }  
  return primeFactors;  
 }  
   
   public void numScan(){
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================="); 
        System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner (System.in);
        
        System.out.printf("%s" ,primeFactors(scanner.nextInt()));
        System.out.println();
        System.out.println("====================="); 
   }
   
public static void main(String[] args) { 
    String menu ;
    do{ 
        System.out.println("(1)PrimeFctory");
        System.out.println("(2)Exit");
        System.out.println("=====================");
        System.out.print("Select : ");
        
        
        Scanner sc = new Scanner(System.in);
        menu = sc.nextLine();
       
        PrimeFactor n = new PrimeFactor();
        
        switch(menu){
            case "1": n.numScan();break;
            case "2": System.exit(0);break;
            default : System.out.println("Enter 1 or 2");  
                   
        }
    }while(menu != "2");
   
 }  
}


