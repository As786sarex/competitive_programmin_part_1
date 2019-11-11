package codechef.practice;



class Shape {
    double length,breadth;

    public Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Shape(double length) {
        this.length = breadth=length;
    }
    double calculate(){
        return length*breadth;
    }
}
class Test1  implements X,Y{
    private double height;
    private Test1(double length, double breadth) {
        //super(length, length);
        this.height=breadth;
    }

    public Test1(double length, double breadth, double height) {
        //super(length, breadth);
        this.height = height;
    }
   /*// double calculate() {
        return length*breadth*height;
    }*/

    public static void main(String[] args) {
        //rest of code
        /*Scanner sc=new Scanner(System.in);
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        Test1 s1=new Test1(l,h);
        Test1 s2=new Test1(l,b,h);
        System.out.println(s1.calculate());*/
        Test1 t=new Test1(67.0,99.0);
        java.util.Calendar cal=java.util.Calendar.getInstance();
        int year=cal.getWeekYear();
        System.out.println(year);
        t.display1();
        t.display2();

    }

    @Override
    public void display2() {
        System.out.println(X.s);
    }

    @Override
    public void display1() {
        System.out.println(Y.s);
    }
}
interface X extends Y{
    String s="X";
    void display2();
}
interface Y {
    String s="Y";
    void display1();
}
