package everyother;

public class Try implements W{


    @Override
    public void run() {
        for (int i = 0; i <5 ; i++);{
            System.out.println("nptel");
        }
    }

    public static void main(String[] args) {
       // new everyother.Try().run();
        try {
            int a=100;
            System.out.println(a);
            int b=a/0;
            System.out.println("kk");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
interface W{
    public abstract void run();
}