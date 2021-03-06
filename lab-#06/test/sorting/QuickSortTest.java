package sorting;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;

public class QuickSortTest {
     
    QuickSort qSort = new QuickSort();

    @Test
    public void simpleTest() {
        int[] sourceArr = {6, 12, 3, 5, 4};
        int[] expectedArr = {3, 4, 5, 6, 12};

        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }

    @Test
    public void emptyTest() {
        int[] sourceArr = new int[0];
        int[] expectedArr = new int[0];

        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }

    @Test
    public void reverseTest() {
        int n = 100;
        int[] sourceArr = new int[n];
        int[] expectedArr = new int[n];

        for (int i = 0; i < n; i++) {
            sourceArr[i] = (n - 1) - i;
            expectedArr[i] = i;
        }

        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }

    @Test
    public void sortedTest() {
        int n = 100;
        int[] sourceArr = new int[n];
        int[] expectedArr = new int[n];

        for (int i = 0; i < n; i++) {
            sourceArr[i] = i;
            expectedArr[i] = i;
        }

        qSort.sort(sourceArr);
        assertArrayEquals(expectedArr, sourceArr);
    }

    @Test
    public void stressTest1K() {
        checkSort(generateArr(1000));
    }

    @Test
    public void stressTest100K() {
        checkSort(generateArr(100000));
    }

    @Test
    public void stressTest1M() {
        checkSort(generateArr(1000000));
    }

    private void checkSort(int[] sourceArr) {
        qSort.sort(sourceArr);

        for (int i = 0; i < sourceArr.length - 1; i++) {
            assertTrue(sourceArr[i] <= sourceArr[i + 1]);
        }
    }

    private int[] generateArr(int length) {
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }
}
