package per.owisho.learn.algorithm;

import java.util.Arrays;

/**
 * 学习D&C思想和递归思想的时候排序想法
 */
public class DCSort {

    public static void main(String[] args) {
        int [] arr = {8,12,99,5,8,22,0,556,44,77,3};
        arr = sort(arr);
        for(int a:arr){
            System.out.print(a +" ");
        }
    }

    /**
     * 缺点：可能会占用比较大的内存
     * 待确定：效率未知
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr){
        if(arr.length<=1)
            return arr;
        int average = average(arr);
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        int arr1len = 0;
        int arr2len = 0;
        for(int a:arr){
            if(a>average){
                arr2[arr2len++]=a;
            }else{
                arr1[arr1len++]=a;
            }
        }
        int[] arr1copy = Arrays.copyOfRange(arr1,0,arr1len);
        int[] arr2copy = Arrays.copyOfRange(arr2,0,arr2len);
        //判断小数组中所有元素是否都等于平均值避免死循环
        int averageNum = 0;
        for(int a : arr1copy){
            if(a==average)
                averageNum++;
        }
        if(averageNum<arr1.length){
            arr1 = sort(arr1copy);
        }else{
            arr1 = arr1copy;
        }
        arr2 = sort(arr2copy);
        int index = 0;
        for(int a:arr1){
            arr[index++]=a;
        }
        for(int a:arr2){
            arr[index++]=a;
        }
        return arr;
    }

    /**
     * 计算整形数据的平均值
     * @param arr
     * @return
     */
    public static int average(int[] arr){
        int sum = 0;
        for(int a:arr){
            sum+=a;
        }
        return sum/arr.length;
    }
}
