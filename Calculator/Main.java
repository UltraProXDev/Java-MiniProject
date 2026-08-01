import java.util.Scanner;
import java.util.ArrayList;
class Calculator{
    public double addition(double num1, double num2){
        return num1 + num2;
    }
    public double subtraction(double num1, double num2){
        return num1 - num2;
    }
    public double multiplication(double num1, double num2){
        return num1 * num2;
    }
    public double division(double num1, double num2){
        return num1 / num2;
    }
    public double mode(double num1, double num2){
        return num1 % num2;
    }
    public double percentage(double num1, double num2){
        return (num1 / num2)*100;
    }
    public double power(double num1, double num2){
        return Math.pow(num1, num2);
    }
    public double root(double num1, double num2){
        return Math.pow(num1, 1.0/num2);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        Calculator obj = new Calculator();
        while(true){
            System.out.println("===== Calculator =====");
            System.out.println("1. Addition.");
            System.out.println("2. Subtraction.");
            System.out.println("3. Multiplication.");
            System.out.println("4. Division.");
            System.out.println("5. Mode.");
            System.out.println("6. Percentage.");
            System.out.println("7. Power.");
            System.out.println("8. root.");
            System.out.println("9. Transaction History.");
            System.out.println("10. Exit.");
            System.out.print("Select the option (1-10) :");
            int choice = scan.nextInt();
            if(choice == 1){
                System.out.print("Enter the first number for addition :");
                double num1 = scan.nextDouble();
                System.out.print("Enter the second number for addition :");
                double num2 = scan.nextDouble();
                history.add(num1+" + "+num2+" = "+obj.addition(num1, num2));
                System.out.println("Addition :"+ obj.addition(num1, num2));
            }else if(choice == 2){
                System.out.print("Enter the first number for subtraction :");
                double num1 = scan.nextDouble();
                System.out.print("Enter the second number for subtraction :");
                double num2 = scan.nextDouble();
                history.add(num1+" - "+num2+" = "+obj.subtraction(num1, num2));
                System.out.println("Subtraction :"+ obj.subtraction(num1, num2));
            }else if(choice == 3){
                System.out.print("Enter the first number for multiplication :");
                double num1 = scan.nextDouble();
                System.out.print("Enter the second number for multiplication :");
                double num2 = scan.nextDouble();
                history.add(num1+" x "+num2+" = "+obj.multiplication(num1, num2));
                System.out.println("Multiplication :"+ obj.multiplication(num1, num2));
            }else if(choice == 4){
                System.out.print("Enter the first number for division by second number :");
                double num1 = scan.nextDouble();
                System.out.print("Enter the second number for division of first number :");
                double num2 = scan.nextDouble();
                history.add(num1+" / "+num2+" = "+obj.division(num1, num2));
                System.out.println("Division :"+ obj.division(num1, num2));
            }else if(choice == 5){
                System.out.print("Enter the first number for mode by second number :");
                double num1 = scan.nextDouble();
                System.out.print("Enter the second number for mode of first number :");
                double num2 = scan.nextDouble();
                history.add(num1+" % "+num2+" = "+obj.mode(num1, num2));
                System.out.println("Mode :"+ obj.mode(num1, num2));
            }else if(choice == 6){
                System.out.print("Enter the number for percentage :");
                double num1 = scan.nextDouble();
                System.out.print("Enter the total number for percentage :");
                double num2 = scan.nextDouble();
                history.add("( "+num1+" / "+num2+" ) x 100 = "+obj.percentage(num1, num2));
                System.out.println("Percentage :"+ obj.percentage(num1, num2));
            }else if(choice == 7){
                System.out.print("Enter the base number :");
                double num1 = scan.nextDouble();
                System.out.print("Enter the exponent number :");
                double num2 = scan.nextDouble();
                history.add(num1+" ^ "+num2+" = "+obj.power(num1, num2));
                System.out.println("Power :"+ obj.power(num1, num2));
            }else if(choice == 8){
                System.out.print("Enter the number for root :");
                double num1 = scan.nextDouble();
                System.out.print("Enter the root number :");
                double num2 = scan.nextDouble();
                history.add(num2+" √ "+num1+" = "+obj.root(num1, num2));
                System.out.println("Root :"+ obj.root(num1, num2));
            }else if(choice == 9){
                for(int i = 0; i < history.size(); i++){
                    System.out.println(history.get(i));
                }
            }else{
                System.out.println("Exiting.....");
                break;
            }
        }
    }
}