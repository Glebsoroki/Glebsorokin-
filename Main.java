import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double p1 = 0, p2 = 0;
        System.out.println("Выберите необходимую функцию, введя число:\n 1)Сложение\n 2)Умножение\n 3)Деление\n 4)Вычитание\n 5)Вычисление квадратного уравнения\n 0)Завершить программу");
        Scanner input = new Scanner(System.in);
        int vbr = input.nextInt();
        while (vbr != 0)
        {

            if (vbr == 1)
            {
                System.out.println("Введите первое число");
                p1 = input.nextDouble();
                System.out.println("Введите второе число");
                p2 = input.nextDouble();
                sum(p1, p2);
            }
            else if (vbr == 2)
            {
                System.out.println("Введите первое число");
                p1 = input.nextDouble();
                System.out.println("Введите второе число");
                p2 = input.nextDouble();
                umnoj(p1, p2);
            }
            else if (vbr == 3)
            {
                System.out.println("Введите первое число");
                p1 = input.nextDouble();
                System.out.println("Введите второе число");
                p2 = input.nextDouble();
                delen(p1, p2);
            }
            else if (vbr == 4)
            {
                System.out.println("Введите первое число");
                p1 = input.nextDouble();
                System.out.println("Введите второе число");
                p2 = input.nextDouble();
                vuchet(p1, p2);
            }
            else if (vbr == 5)
            {
                System.out.println("Квадратное уравнение имеет вид: ax² + bx + c");
                System.out.println("Введите последовательно a, b, c");
                double a = input.nextDouble();
                double b = input.nextDouble();
                double c = input.nextDouble();
                kvur(a, b, c);
            }
            else
            {
                if (vbr < 0 | vbr > 5)
                {
                    System.out.println("Выбор не распознан, повторите попытку");
                    vbr = input.nextInt();
                }
            }
        }
    }


    public static void sum(double p1, double p2) {
        System.out.println("Результат сложения равен\n" + (p1 + p2));
    }

    public static void vuchet(double p1, double p2) {
        System.out.println("Результат вычитания равен\n" + (p1 - p2));
    }

    public static void umnoj(double p1, double p2) {
        System.out.println("Результат умножения равен\n" + (p1 * p2));
    }

    public static void delen(double p1, double p2) {
        System.out.println("Результат деления равен\n" + (p1 / p2));
    }

    public static void kvur(double a, double b, double c)
    {
        double x1 = 0, x2 = 0;
        double D = (b * b) - (4 * a * c);
        if (D < 0) {
            System.out.println("Действительных корней нет");
        } else {
            if (D == 0) {
                System.out.println((-b) / (2 * a));
            } else {
                x1 = ((-b + Math.sqrt(D)) / (2 * a));
                x2 = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("Корни уравнения:\n x1=" + " " + x1 + "x2=" + " " + x2);
            }
        }


    }
}