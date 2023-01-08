import org.example.BalancedWordsCounter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BalancedWordsCounterTest {
    private BalancedWordsCounter balancedWordsCounter;

    @Before
    public void setUp() {
        balancedWordsCounter = new BalancedWordsCounter();
    }

    @Test
    public void isBalanced_ok() {
        Integer expected = 1;
        Integer result = balancedWordsCounter.count("zaazcc");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void isNotBalanced_ok() {
        Integer expected = 0;
        Integer result = balancedWordsCounter.count("zaazccc");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void inputWithNotOnlyLetters_exception() {
        Assert.assertThrows(RuntimeException.class, () -> {
            balancedWordsCounter.count("zaazccc1");
        });
        Assert.assertThrows(RuntimeException.class, () -> {
            balancedWordsCounter.count("zaa-zccc.");
        });
    }

    @Test
    public void inputNull_exception() {
        String input = null;
        Assert.assertThrows(RuntimeException.class, () -> {
            balancedWordsCounter.count(input);
        });
    }
}
