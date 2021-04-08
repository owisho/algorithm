package per.owisho.learn.algorithm.book.introduction.to.algorithms.chap22;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;

public class Chart {

    LinkedList<Integer>[] adj;

    public Chart(){

    }

    public static Chart createDemo(){
        Chart chart = new Chart();
        chart.adj = new LinkedList[7];
        chart.adj[1]=new LinkedList<>(Arrays.asList(2,4));
        chart.adj[2]=new LinkedList<>(Arrays.asList(5));
        chart.adj[3]=new LinkedList<>(Arrays.asList(6,5));
        chart.adj[4]=new LinkedList<>(Arrays.asList(2));
        chart.adj[5]=new LinkedList<>(Arrays.asList(4));
        chart.adj[6]=new LinkedList<>(Arrays.asList(6));
        return chart;
    }

    public static void printChart(Chart chart){
        for(int i=1;i<chart.adj.length;i++){
            System.out.print(i+"可以到达的顶点为:");
            for(Integer j:chart.adj[i]){
                System.out.print(j+",");
            }
            System.out.println();
        }
    }

    public Chart transpose(){
        Chart newChart = new Chart();
        newChart.adj = new LinkedList[this.adj.length];

        for(int i=1;i<newChart.adj.length;i++){
            newChart.adj[i] = new LinkedList<>();
        }

        for(int i=1;i<this.adj.length;i++){
            for(int j:this.adj[i]){
                newChart.adj[j].add(i);
            }
        }
        return newChart;
    }

    public static void main(String[] args) {
        Chart demo = createDemo();
        printChart(demo);
        demo = demo.transpose();
        printChart(demo);
    }

}
