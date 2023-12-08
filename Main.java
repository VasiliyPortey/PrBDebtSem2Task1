import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину первого массива: ");
        int length = sc.nextInt();
        System.out.println("Заполняем массив длины ".concat(String.valueOf(length)).concat(" случайными числами от -10 до 10..."));
        ArrayList<Integer> firstArray = new ArrayList<>();
        randomEntering(firstArray, -10, 10, length);
        System.out.println("Получившийся массив: ".concat(firstArray.toString()));
        System.out.println("Введите длину второго массива: ");
        length = sc.nextInt();
        System.out.println("Заполняем массив длины ".concat(String.valueOf(length)).concat(" случайными числами от -10 до 10..."));
        ArrayList<Integer> secondArray = new ArrayList<>();
        randomEntering(secondArray, -10, 10, length);
        System.out.println("Получившийся массив: ".concat(secondArray.toString()));
        System.out.println("Теперь объединим их в новый массив без дубликатов с помощью чудесного класса HashSet");
        firstArray.addAll(secondArray);
        HashSet<Integer> numbersSet = new HashSet<>(firstArray);
        System.out.println("Наш получившийся массив (набор): ".concat(numbersSet.toString()));
    }

    private static void randomEntering(ArrayList<Integer> arr, int min, int max, int length) {
        max -= min;
        for (int i = 0; i < length; i++)
            arr.add(Integer.valueOf((int)(Math.random() * ++max) + min));
    }
}