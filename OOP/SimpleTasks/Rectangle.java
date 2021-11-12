class Rectangle{
    int a;
    int b;

    public int area(){
        return a*b;
    }

    public int perimeter(){
        return a+a+b+b;
    }
}

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.a =5;
        r.b= 6;


        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
