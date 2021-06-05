
import java.util.Scanner;


public class ArithmaticCalculator {
    
      
    public static void main(String[] args){
        
     ArithmaticCalculator Ac = new ArithmaticCalculator();
     Ac.display();
     
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter First Number");
     double x1 = sc.nextInt();
     System.out.println("Enter Second Number");
     double x2 = sc.nextInt();
     System.out.println("Enter from 1 to 4 , 1:Add , 2:Sub,3:Mul ,4:Div");
     int op = sc.nextInt();
     
     if (op == 1){
     System.out.println("Result = "+ Add(x1,x2));
     }
     else if(op==2){
     System.out.println("Result = "+ Sub(x1,x2));
     }
     else if (op==3){
     System.out.println("Result = "+ Mul(x1,x2));
     }
     else
         System.out.println("Result = "+ Div(x1,x2));
     
     
       
    }
    
    public void display() 
     { 
         System.out.println("You are using Simple Calculator"); 
     } 
    
   public static double Add(double num1,double num2){
       double result;
       return result = num1+num2;
    }
    
    public static double Sub(double num1,double num2){
       double result;
       return result = num1-num2;
    }
    
    public static double Mul(double num1,double num2){
        double result;
       return result = num1*num2;
    }
    
    public static double Div(double num1,double num2){
        double result;
       return result = num1/num2;
    }
    
    
}
