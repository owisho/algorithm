package per.owisho.learn.algorithm;

import java.lang.reflect.Array;

/**
 * 快速排序
 */
//TODO  未测试
public class QuickSort {

    public static <T> T[] quicksort(T[] arr,Class<T> tcls){
        if(arr.length<2)
            return arr;
        T t = arr[0];
        int lessCount = 0;
        int greaterCount = 0;
        T[] less = (T[])Array.newInstance(tcls,arr.length-1);
        T[] greater = (T[])Array.newInstance(tcls,arr.length-1);

        //如果类的元素是可以比较的
        if(tcls.isAssignableFrom(Comparable.class)){
            Comparable tt = (Comparable) t;
            for(int i=1;i<arr.length-1;i++){
                Comparable t1 = (Comparable)arr[i];
                if(t1.compareTo(tt)>0){
                    greater[greaterCount] = arr[i];
                    greaterCount++;
                }else{
                    less[lessCount] = arr[i];
                    lessCount++;
                }
            }
            T[] resultArr = (T[])Array.newInstance(tcls,arr.length);
            if(lessCount>0){
                System.arraycopy(less,0,resultArr,0,lessCount);
            }
            resultArr[lessCount] = t;
            if(greaterCount>0){
                System.arraycopy(greater,0,resultArr,lessCount+1,greaterCount);
            }
            return resultArr;
        }else{
            return arr;
        }
    }

}
