import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import randomnumbers.RandomNumbers;

public class RandomNumbersTests {
    private int numbers[];
    @Before
    @Test(timeout=170)
    public void getRandomNumbersTime(){
        numbers = RandomNumbers.getRandomNumbers();
    }
    @Test(timeout=1400)
    public void sortTime(){
        Arrays.sort(numbers);
    }
}
