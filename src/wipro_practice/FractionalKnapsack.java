package wipro_practice;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] wt = {10, 40, 20, 30};
        int[] val = {60, 40, 100, 120};
        int capacity = 50;
        System.out.print(getCost(val,wt,capacity));
    }

    public static int getCost(int[] val, int[] wt, int capacity) {
        int finalCost = 0;
        Item[] items=new Item[val.length];
        for (int i = 0; i <val.length ; i++) {
            items[i]=new Item((double)(val[i]/wt[i]),val[i],wt[i],i);
        }
        Arrays.sort(items, (o1, o2) -> {
            if (o1.cost==o2.cost)
                return 0;
            return o1.cost<o2.cost?1:-1;
        });

        for (Item i: items){
            if (capacity-i.wt>=0){
                finalCost+=i.val;
                capacity-=i.wt;
            }
            else{
                double fraction=(double)capacity/(double)i.wt;
                finalCost+=(i.val*fraction);
                capacity-=(i.wt*fraction);
            }
        }
        return finalCost;
    }

    static class Item {
        double cost;
        int val,wt,index;

        public Item(double cost, int val, int wt, int index) {
            this.cost = cost;
            this.val = val;
            this.wt = wt;
            this.index = index;
        }
    }
}
