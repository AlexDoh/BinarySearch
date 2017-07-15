import com.odmytrenko.binarysearch.BinarySearch;
import org.junit.Assert;
import org.junit.Test;

public class TestBinarySearch {

    @Test
    public void shouldReturnProperIndexOfTarget() {
        int target = 6;
        int[] array = {9, 10, 15, 20, 440, 1000, 1, 3, 4, 5, 6, 7, 8};

        int expectedIndex = 10;
        int actualIndex = BinarySearch.find(array,target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void shouldReturnNonexistentIndexOfTarget() {
        int target = 101;
        int[] array = {9, 10, 15, 20, 440, 1000, 1, 3, 4, 5, 6, 7, 8};

        int expectedIndex = -1;
        int actualIndex = BinarySearch.find(array,target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void shouldReturnNonexistentIndexForEmptyArray() {
        int target = 100;
        int[] array = {};

        int expectedIndex = -1;
        int actualIndex = BinarySearch.find(array,target);
        Assert.assertEquals(expectedIndex, actualIndex);
    }

}
