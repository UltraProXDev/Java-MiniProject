import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
class Bet{
    private double money = 0;
    public double addMoney(double value){
        money += value;
        return money;
    }
    public double withdrawnMoney(double value){

        money -= value;
        return money;
    }
    public boolean playTheBet(double value, int predict){
        Random num = new Random();
        int random = num.nextInt(10) + 1; 
        if(random == predict){
            money += value;
            return true;
        }else{
            money -= value;
            return false;
        }
    }
    public double balance(){
        return money;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        Bet obj = new Bet();
        while(true){
            System.out.println("===== Bet Game =====");
            System.out.println("1. Add Money.");
            System.out.println("2. Withdrawn Money.");
            System.out.println("3. Play the Bet.");
            System.out.println("4. Exit.");
            System.out.print("Select the option (1-4) :");
            int choice = scan.nextInt();
            if(choice == 1){
                System.out.print("How much money would you like to add in the game : ₹");
                double value = scan.nextDouble();
                obj.addMoney(value);
                history.add("Add : ₹" + value);
                System.out.println("Money Added successful.");
                System.out.println("Current Balance: ₹" + obj.balance());
                
            }else if(choice == 2){
                System.out.print("How much money would you like to Withdraw : ₹");
                double value = scan.nextDouble();
                if(value < obj.balance()){
                    history.add("Withdrawn: ₹" + value);
                    obj.withdrawnMoney(value);
                    System.out.println("Withdrawal successful.");
                    System.out.println("Available balance: ₹" + obj.balance());
                }
            }else if(choice == 3){
                System.out.print("How would you like to bet :");
                double value = scan.nextDouble();
                if(obj.balance() >= value){
                    System.out.print("Predict the number between (1 - 10): ");
                    int predict = scan.nextInt();
                    if(obj.playTheBet(value, predict)){
                        System.out.println("Congratulations, You are win the bet and getting Rs."+ value);
                    }else{
                        System.out.println("Bad Luck, You are Lose the bet and lost Rs."+ value);
                    }
                    if (obj.balance() == 0.0) {
                        System.out.println("Your balance is "+ obj.balance());
                        System.out.println("You should add money.");
                    }
                    
                }else{
                    System.out.println("You don't have money!");
                    System.out.println("Your balance is "+ obj.balance());
                }
            }else{
                System.out.println("Exiting.....");
                break;
            }
        }
    }
}