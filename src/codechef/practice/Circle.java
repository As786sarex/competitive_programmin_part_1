package codechef.practice;

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Point p=new Point();
        p.x=sc.nextDouble();
        p.y=sc.nextDouble();
        Point c=new Point();
        c.x=sc.nextDouble();
        c.y=sc.nextDouble();
        Circle ci=new Circle();
        ci.distance(p,c);

    }
    void distance(Point p1,Point p2){
        double px=p1.x-p2.x;
        double py=p1.y-p2.y;
        System.out.println(Math.sqrt((px*px)+(py*py)));
    }
}
class Point{
    public double x,y;
}
