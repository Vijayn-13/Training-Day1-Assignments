import java.util.*;
public class qn6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        do{
            System.out.print("Enter N: ");
            N=sc.nextInt();
        }while(N<0 || N>=31);
        for(int i=0;i<=N;i++){
            System.out.println("Power of 2^"+i+": "+(int)Math.pow(2,i));
        }
    }
}
