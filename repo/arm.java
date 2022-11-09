import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int x=0;
        while(i<n){
           while(n!=0){

           } n=n%10;
            x+=(i*i*i);
            n=n/10;
        }
        if(x==i){
            System.out.println(x);
        }
    }
}
