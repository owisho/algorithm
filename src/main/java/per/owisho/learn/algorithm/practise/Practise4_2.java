package per.owisho.learn.algorithm.practise;

import java.util.ArrayList;
import java.util.List;

public class Practise4_2 {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(recursion_listSize(list));
    }

    public static int recursion_listSize(List<Object> list){
        if(list==null)
            return 0;
        try{
            list.remove(0);
        }catch (IndexOutOfBoundsException e){
            return 0;
        }
        return 1+recursion_listSize(list);
    }

}
