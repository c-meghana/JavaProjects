import java.util.Scanner;

public class CurrencyConverter{

    public static void main(String[] args){
        System.out.println("1. Rupee");
        System.out.println("2. Dollar");
        System.out.println("3. Euro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amt = sc.nextDouble();
        switch(choice){
            case 1:
                Rupee_to_other(amt);
            case 2:
                Dollar_to_other(amt);
                case 3:
                Euro_to_other(amt);
        }
    }       
        public static void Rupee_to_other(double amount){
            System.out.println(amount + "Rupee is "+ (amount*0.012) + " Dollar");
            System.out.println(amount + "Rupees is "+ (amount*0.011) + " Euro");
        }      
        
        public static void Dollar_to_other(double amount){
            System.out.println(amount + "Dollars is " + (amount*82) + "Rupees");
            System.out.println(amount + "Dollars is " + (amount*0.9) + "Euro");
        }
        public static void Euro_to_other(double amount){
            System.out.println(amount + "Euros is" + (amount*81) + " Rupees");
            System.out.println(amount + "Euros is" + (amount * 0.1) + " Dollars");
        }
}
