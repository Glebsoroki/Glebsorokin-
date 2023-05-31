import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите номер задание:\n" +
                "1. Определение сколько раз в последовательности меняется знак (в конце последовательности введите 0)\n" +
                "2. Средняя арифметическая отрицательных чисел и неотреательных (для завершения 1001)\n" +
                "3. Проверка всех чисел в последовательности на уникальность\n" +
                "4. Найти самое популярное и длинное слова в тексте");
        int num = input.nextInt();
        switch (num){
            case 1 -> zad1();
            case 2 -> zad2();
            case 3 -> zad3();
            case 4 -> zad4();
            default -> System.out.println("Задание выбрано неправильно");
        }
    }
    public static void zad1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float a = input.nextFloat();
        boolean znak = a>0;
        int smena = 0;
        System.out.print("Дальше просто вводите числа (напоминание: в конце введите 0): ");
        while(true){
            a = input.nextFloat();
            if (a==0){
                break;
            }
            if (!(znak == a>0)){
                znak = a>0;
                smena += 1;
            }
        }
        System.out.println("Знак поменялся всего " + smena + " раз");
    }
    public static void zad2(){
        Scanner input = new Scanner(System.in);
        float ch;
        float polchs = 0;
        int pol = 0;
        float otchs = 0;
        int ot = 0;
        System.out.print("Дальше просто вводите числа (для завершения введите 1001): ");
        while(true){
            ch = input.nextFloat();
            if (ch==1001){
                break;
            } else if (ch < 0){
                otchs += ch;
                ot += 1;
            } else {
                polchs += ch;
                pol += 1;
            }
        }
        System.out.println("Среднее арифметическое отрицательных чисел = " + otchs/ot);
        System.out.println("Среднее арифметическое неотрицательных чисел = " + polchs/pol);
    }
    public static void zad3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Дальше просто вводите числа (для завершения введите 0): ");
        float ch = input.nextFloat();
        float[] spi = new float[1];
        spi [0] = ch;
        while (true){
            boolean crash = false;
            ch = input.nextFloat();
            if (ch == 0){
                System.out.println("Все введённые числа - уникальные");
                break;
            } else {
                for (int i = 0;i < spi.length;i++){
                    if (spi[i] == ch){
                        crash = true;
                        break;
                    }
                }
                if (crash){
                    System.out.println("Числа не уникальны (Повторяющееся число - " + ch + ")");
                    break;
                } else {
                    float[] backup = new float[spi.length];
                    for (int i = 0; i<spi.length;i++){
                        backup[i] = spi [i];
                    }
                    spi = new float[backup.length+1];
                    for (int i = 0; i<spi.length-1;i++){
                        spi[i] = backup [i];
                    }
                    spi[spi.length-1] = ch;
                }
            }
        }
    }
    public static void zad4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = input.nextLine();
        System.out.println(text);
        String[] simDel = new String[]{"\\.",",","!",":",";","\\?"};
        for (int i = 0; i<simDel.length; i++){
            text = text.replaceAll(simDel[i], "");
        }
        text = text.toLowerCase();
        System.out.println(text);
        String[] slova = text.split(" ");
        String samPop = "";
        int sam = 0;
        String samDlin = "";
        int dlin = 0;
        boolean zup = true;
        for (int i=0;i< slova.length;i++){
            int t = 0;
            for (int j=0;j< slova.length;j++){
                if (slova[i].equals(slova[j])){
                    t+=1;
                }
            }
            if (slova[i].length()>dlin){
                dlin = slova[i].length();
                samDlin = slova[i];
            }
            if (t>sam){
                sam = t;
                samPop = slova[i];
            }
        }
        System.out.println("Самое частое слово - \"" + samPop + "\". Всего он встречается - " + sam + " раз/а.");
        System.out.println("Самое длинное слово - \"" + samDlin + "\". Его длинна - " + dlin + " букв/ы.");
    }
}