import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many numbers you want:");
        int num=sc.nextInt();
        int sum = 0;
        for (int i=1;i<=num;i++){
            System.out.println("Enter "+i+" num:");
            int n=sc.nextInt();
            sum += n;
        }

        double ave=sum/num;
        System.out.println("Average of your numbers is:"+ave);
    }
}
