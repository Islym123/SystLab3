import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int n = in.nextInt();// Кол-во голосов
        int numbergroop = 0;// Номер группы

        HashMap<Integer, Integer> hash = new HashMap<>();

        // Заполнение словаря голосами
        for (int i = 0; i < n; i++) {
            numbergroop = rand.nextInt(1,17);
            hash.put(numbergroop, 1 + hash.getOrDefault(numbergroop, 0));
        }

        // Преобразование в список
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hash.entrySet());

        // Сортировка списка по значениям в порядке убывания
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Вывод отсортированных элементов
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println("У группы " + entry.getKey() + " " + entry.getValue() + " голосов");
        }
    }
}