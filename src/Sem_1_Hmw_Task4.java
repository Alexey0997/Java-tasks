import java.util.stream.IntStream;

/*
Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
 */
public class Sem_1_Hmw_Task4 {
    public static void main(String[] args) {
        int value = 69;
        int[] first_numbers = IntStream.rangeClosed(20, 29).toArray();  // Создадим массив возможных значений первого слагаемого.
        int[] second_numbers = new int[]{15, 25, 35, 45};               // Создадим массив возможных значений второго слагаемого.

        boolean flag = false;
        int a = 0;
        int b = 0;
        for (int i : first_numbers) {
            for (int j : second_numbers) {                              // Вложенный цикл проверяет возможные комбинации чисел.
                if (i + j == value) {                                   // Если их сумма равна 69, выводим на печать.
                    a = i;
                    b = j;
                    flag = true;
                }
            }
        }
        if (flag){
            System.out.println("Равенство: 2? + ?5 = 69 справедливо при следующих слагаемых: ");
            System.out.printf("Первое число: %d", a);
            System.out.println();
            System.out.printf("Второе число: %d", b);
        }
        else{
            System.out.println("Решений нет.");
        }
    }
}
