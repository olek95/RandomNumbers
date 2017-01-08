import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import randomnumbers.RandomNumbers;
/**
 * Klasa <code>RandomNumbersTests</code> reprezentuje zestaw testów spradzających 
 * prędkość losowania i sortowania liczb. 
 * @author AleksanderSklorz 
 */
public class RandomNumbersTests {
    private int numbers[];
    /**
     * Test sprawdzający czy liczby zostaną wylosowane w mniej niż 170 ms. 
     * Wykonuje się przed pozostałymi testami, aby następne testy miały już 
     * wylosowane liczby do sortowania. 
     */
    @Before
    @Test(timeout=170)
    public void getRandomNumbersTime(){
        numbers = RandomNumbers.getRandomNumbers();
    }
    /**
     * Test sprawdzający czy liczby zostaną posortowane w mniej niż 1400 ms. 
     */
    @Test(timeout=1400)
    public void sortTime(){
        Arrays.sort(numbers);
    }
}
