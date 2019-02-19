package per.owisho.learn.algorithm.practise;

/**
 * 课后练习4.1
 * 用递归实现sum函数
 */
public class Practise4_1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(recursion_sum(arr));
    }

    public static int recursion_sum(int[] arr){
        if(arr.length==0)
            return 0;
        if(arr.length==1)
            return arr[0];
        int[] subArr = new int[arr.length-1];
        System.arraycopy(arr,1,subArr,0,subArr.length);
        return arr[0]+recursion_sum(subArr);
    }

}
