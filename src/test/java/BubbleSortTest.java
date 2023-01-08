import org.example.BubbleSort;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@SuppressWarnings("unchecked")
public class BubbleSortTest {
    private BubbleSort bubbleSort;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void sortIntegers_ok() {
        List<Integer> expected = List.of(1, 3, 4, 5, 6, 8, 8);
        List<Integer> result = (List<Integer>) bubbleSort.sortGeneral(List.of(1, 4, 5, 6, 8, 3, 8));

        assertEquals(expected, result);
    }

    @Test
    public void sortDoubles_ok() {
        List<Double> expected = List.of(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);
        List<Double> result = (List<Double>) bubbleSort.sortGeneral(List.of(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0));

        assertEquals(expected, result);
    }

    @Test
    public void sortFloats_ok() {
        List<Float> expected = List.of(5.0001F);
        List<Float> floats = new ArrayList<>();
        floats.add(null);
        floats.add(5.0001F);
        List<Float> result = (List<Float>) bubbleSort.sortGeneral(floats);

        assertEquals(expected, result);
    }

    @Test
    public void emptyList_ok() {
        List<Float> resultFloat = (List<Float>) bubbleSort.sortGeneral(new ArrayList<>());
        List<Double> resultDouble = (List<Double>) bubbleSort.sortGeneral(new ArrayList<>());
        List<Integer> resultInteger = (List<Integer>) bubbleSort.sortGeneral(new ArrayList<>());

        assertEquals(List.of(), resultInteger);
        assertEquals(List.of(), resultFloat);
        assertEquals(List.of(), resultDouble);
    }

    @Test
    public void inputNull_exception() {
        List<Float> listOfNull = null;

        assertThrows(RuntimeException.class, () -> {
            bubbleSort.sortGeneral(listOfNull);
        });
    }
}
