package per.owisho.learn.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectionSort {

    /**
     * 获取列表中的最小元素
     * @param list
     * @return
     */
    public static int findSmallest(ArrayList<Integer> list){
        int smallest = list.get(0);
        int smallest_index = 0;
        for(int i=1;i<list.size();i++){
            if(list.get(i)<smallest){
                smallest = list.get(i);
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    /**
     * 对列表进行排序(从小到大)
     * @param list
     * @return 返回一个经过排序的新列表
     */
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int listSize = list.size();
        for(int i=0;i<listSize;i++){
            int smallest_index = findSmallest(list);
            newList.add(list.get(smallest_index));
            list.remove(smallest_index);
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(6,5,4,3,2,1,0));
        ArrayList<Integer> newList = selectionSort(list);
        System.out.println(newList);

    }

}
