package per.owisho.learn.algorithm;

import org.junit.Test;

public class LevenshteinDistanceTest {

    @Test
    public void distance(){

        int distance = LevenshteinDistance.distance("1","sjssj");
        System.out.println(distance);

    }

}
