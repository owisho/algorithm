package per.owisho.learn.algorithm.practise;

import java.util.ArrayList;
import java.util.List;

public class Practise4_3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(8);
        list.add(7);
        System.out.println(recursion_max(list));
    }

    public static int recursion_max(List<Integer> list){
        if(list==null||list.size()==0)
            return 0;
        if(list.size()==1)
            return list.get(0);
        int element = list.remove(0);
        int submax = recursion_max(list);
        return element>submax?element:submax;
    }

}
