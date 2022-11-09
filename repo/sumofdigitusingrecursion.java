import java.util.Scanner;

public class sumofdigitusingrecursion {
    static int digitSum(int n){
        if (n == 0)
           return 0;
        return (n % 10 + digitSum(n / 10));
     }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=s.nextInt();
        int sum=digitSum(n);
        System.out.println("Sum:="+sum);
    }
}
