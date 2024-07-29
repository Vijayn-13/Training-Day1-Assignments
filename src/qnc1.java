import java.util.*;
class Rectangle{
    int l,w;
    Rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }
    public int area(){
        return (this.l*this.w);
    }
    public int perimeter(){
        return (2*(this.l+this.w));
    }
}
public class qnc1
{
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(4,5);
        System.out.println("Dimensions:-\nLength: "+rec.l+"\nWidth: "+rec.w);
        System.out.println("Area of Rectangle: "+rec.area());
        System.out.println("Perimeter of Rectangle: "+rec.perimeter());
    }
}