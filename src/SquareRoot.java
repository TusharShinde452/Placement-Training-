import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to know its square root:");
        int num=sc.nextInt();

        for (float inum=1;inum<=num;inum++){
            if (inum*inum==num){
            System.out.println("square root is :" +inum);}

        }
    }
}
