import java.util.*;
public class qn4 {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter number of times to flip: ");
            n=sc.nextInt();
        }while(n<0);
        float tail_count=0;
        float c;
        for(int i=0;i<n;i++){
            c=rand.nextFloat();
            System.out.println(c);
            if(c<0.5){
                tail_count++;
                System.out.println("Tail");
            }
            else{
                System.out.println("Head");
            }
        }
        System.out.println("Percentage of Head: "+(100-(tail_count/n)*100));
        System.out.println("Percentage of Tail: "+(tail_count/n)*100);
    }
}
