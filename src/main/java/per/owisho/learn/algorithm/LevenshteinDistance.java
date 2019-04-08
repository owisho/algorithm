package per.owisho.learn.algorithm;

public class LevenshteinDistance {

    public static int distance(String str1,String str2){
        char[] charArr1 = new char[0];
        if(str1!=null)
            charArr1 = str1.toCharArray();
        char[] charArr2 = new char[0];
        if(str2!=null)
            charArr2 = str2.toCharArray();
        return distance(charArr1,charArr2);

    }

    public static int distance(char[] charArr1, char[] charArr2) {

        //定义行数为原始字符长度+1，列数为目标字符长度+1的矩阵
        int[][] matirx = new int[charArr1.length+1][charArr2.length+1];
        //初始化
        init(matirx);
        for(int i=1;i<charArr1.length+1;i++){
            for(int j=1;j<charArr2.length+1;j++){
                int left = matirx[i][j-1];
                int top = matirx[i-1][j];
                int leftTop = matirx[i-1][j-1];
                int distance = Math.min(left,Math.min(top,leftTop));
                if(i>charArr2.length||charArr1[i-1]!=charArr2[j-1]){
                    distance = distance+1;
                }
                matirx[i][j] = distance;
            }
        }
//        for(int i=0;i<matirx.length;i++){
//            for(int j=0;j<matirx[i].length;j++){
//                System.out.print(matirx[i][j]+" ");
//            }
//            System.out.println();
//        }
        return matirx[charArr1.length][charArr2.length];

    }

    private static void init(int[][] matirx) {
        int row = matirx.length;
        int col = matirx[0].length;
        for(int i=0;i<row;i++){
            matirx[i][0] = i;
        }
        for(int i=0;i<col;i++){
            matirx[0][i] = i;
        }
    }

}
