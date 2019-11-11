package hackerrank;

public class Day21Generics<T> {

    public static void main(String[] args) {
        int res=0;
        int counter=0;
        char[] bn=Integer.toBinaryString(1001).toCharArray();
        for (int i = 0; i <bn.length ; i++) {
            if (bn[i]=='1'){
                counter++;
                if (counter>res){
                    res=counter;
                }
            }
            else{
                counter=0;
            }
        }
        System.out.println(res);

    }
}
