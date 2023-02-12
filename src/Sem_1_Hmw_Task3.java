import java.util.Scanner;

/*
Реализовать простой калькулятор.
 */
public class Sem_1_Hmw_Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);     // Определяем экземпляр сканера.
        System.out.print("Введите первое число: ");    // Запрашиваем первое число.
        double a = iScanner.nextDouble();

        System.out.print("Введите знак: +, -, / или *: ");
        String znak = iScanner.next();

        System.out.print("Введите второе число: ");    // Запрашиваем первое число.
        double b = iScanner.nextDouble();
        double result = 0;

        switch (znak) {                                // Используем оператор выбора для рассчета результата.
            case "+":
                result = a + b;                        // Сложение.
                System.out.print("Результат вычисления: ");
                System.out.println(result);
                break;
            case "-":
                result = a - b;                        // Вычитание.
                System.out.print("Результат вычисления: ");
                System.out.println(result);
                break;
            case "/":
                result = a / b;                        // Деление.
                System.out.print("Результат вычисления: ");
                System.out.println(result);
                break;
            case "*":
                result = a * b;                        // Умножение.
                System.out.print("Результат вычисления: ");
                System.out.println(result);
            default:
        }
    }
}
