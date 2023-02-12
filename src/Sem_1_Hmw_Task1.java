import java.util.Scanner;
import java.util.stream.IntStream;
/*
Вычислить n-ое треугольного числа (сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
 */
public class Sem_1_Hmw_Task1 {
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);                 // Определяем экземпляр сканера.
        System.out.print("Введите целое число n > 0: ");           // Запрос числа у пользователя.
        int n = iScanner.nextInt();                                // Переменной n присвоим введенное значение.
        int[] nums_array = IntStream.rangeClosed(1, n).toArray();  // Создадим массив чисел от 1 до n.

        int sum = 0;                                               // Определим сумму чисел от 1 до n.
        for (int j : nums_array){
            sum += j;
        }
        System.out.print("Треугольное число Tn = ");
        System.out.println(sum);

        int product = 1;                                            // Определим произведение чисел от 1 до n.
        for (int j : nums_array){
            product = product * j;
        }
        System.out.print("Факториал числа (n)! = ");
        System.out.println(product);
    }
}
