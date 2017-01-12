package randomnumbers;

import java.util.Arrays;
import java.util.Random;
/**
 * Klasa <code>RandomNumbers</code> reprezentuje sortowanie 10000000 losowych liczb. 
 * @author AleksanderSklorz 
 */
public class RandomNumbers {
    /**
     * Losuje 10000000 liczb. 
     * @return tablica 10000000 losowych liczb.
     */
    public static int[] getRandomNumbers(){
        Random rand = new Random(); 
        int[] numbers = new int[10000000];
        for(int i = 0; i < 10000000; i++)
            numbers[i] = rand.nextInt();
        return numbers;
    }
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        int[] numbers = getRandomNumbers();
        System.out.println("Milisekundy losowania: " + (System.currentTimeMillis() - before));
        System.out.println("Liczby przed sortowaniem: ");
        for(int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");
        System.out.println();
        before = System.currentTimeMillis();
        Arrays.sort(numbers);
        long after = System.currentTimeMillis();
        System.out.println("Liczby po sortowaniu: ");
        for(int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");
        System.out.println();
        System.out.println("Milisekundy sortowania: " + (after - before));
    }
}
