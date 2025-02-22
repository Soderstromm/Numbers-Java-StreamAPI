import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        //1. Фильтрация списка с получением положительных чисел.
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int positive : list) {
            if (positive > 0) {
                positiveNumbers.add(positive);
            }
        }
        //2. Фильтрация списка с получением четныъ чисел.
        List<Integer> evenNumbers = new ArrayList<>();
        for (int even : positiveNumbers) {
            if (even % 2 == 0) {
                evenNumbers.add(even);
            }
        }
        //3. Сортируем числа в порядке возрастания.
        Collections.sort(evenNumbers);

        //4. Вывод результата на экран
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}