import java.util.Scanner;

public class DiscountCalculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your bill amount:");
        double bill=sc.nextInt();
        if (bill>=5000){
            bill=(bill*0.8);
            System.out.println(" you got 20 % discount on your bill so your final bill amount is "+bill);
        } else if (bill>=3000) {
            bill= (bill*0.9);
            System.out.println("you got 20 % discount on your bill so your final bill amount is "+bill);
        }
        else {
            System.out.println("your bill anount is "+bill);
        }
    }
}
