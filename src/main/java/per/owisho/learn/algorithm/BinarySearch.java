package per.owisho.learn.algorithm;

/**
 * 二分查找
 * 条件：在有序的情况下进行查找
 * 在n长度的数组中进行查找的次数为以2为底n的对数
 * log2  n
 * */
public class BinarySearch {

    /**
     * 条件arrs的数据元素按照从小到大的顺序排列
     * @param arrs 包含要查找数据的数组
     * @param obj 要进行查找的数字
     * @return 要查找的数字在数据中的坐标，如果没有则返回-1
     */
    public static int binarySearch(int[] arrs,int obj) {
        int low = 0;
        int high = arrs.length-1;
        if(arrs[low]==obj){
            return low;
        }else if(arrs[high]==obj){
            return high;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(arrs[mid]==obj){
                return mid;
            }else if(arrs[mid]<obj){
                low = mid;
            }else if(arrs[mid]>obj){
                high = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrs = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println(binarySearch(arrs,16));
    }

}
