package per.owisho.learn.algorithm;

/**
 * 递归算法
 */
public class Recursion {

    public static void main(String[] args) {
        Box box = generateBox();
        recursion(box);
//        unRecursion(box);
    }

    public static Box generateBox(){
        //测试数据开始
        Box box = new Box();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        box.box = box1;
        box1.box = box2;
        box2.box = box3;
        box3.key = "key";
        //测试数据结束
        return box;
    }

    /**
     * 递归方式找钥匙
     * @param box
     */
    public static void recursion(Box box){
        if(box.key==null&&box.box!=null){
            recursion(box.box);
        }
        if(box.key!=null){
            System.out.println("已经找到："+box.key);
        }
    }

    public static void unRecursion(Box box){
        while(box.key==null){
            box = box.box;
        }
        System.out.println("已经找到："+box.key);
    }

}

class Box{

    Box box;

    String key;

}