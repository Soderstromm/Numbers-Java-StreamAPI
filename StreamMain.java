import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Создаем поток из списка
        Stream<Integer> stream = list.stream();

        // Применяем промежуточные операции:
        // 1. Фильтруем положительные числа
        // 2. Фильтруем четные числа
        // 3. Сортируем в порядке возрастания
        stream.filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(x -> System.out.print(x + " "));
    }
}
