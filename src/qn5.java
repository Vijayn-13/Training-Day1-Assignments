import java.util.*;
public class qn5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        String str;
        do{
            System.out.print("Enter year: ");
            n=sc.nextInt();
            str=Integer.toString(n);
            System.out.println(str);
        }while(str.length()!=4);
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
                if(n%400!=0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
