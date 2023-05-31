import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите нмоер задачи:\n" +
                "1. Создание массива n*n\n" +
                "2. Создание звездочки в массиве\n" +
                "3. Создание массива с числами в массиве по мере убывания от главной диагонали");
        int vvod = input.nextInt();
        switch (vvod){
            case 1 -> zad1();
            case 2 -> zad2();
            case 3 -> zad3();
            default -> System.out.println("Неправильно выбрано задание, досвидание!!!");
        }
    }
    public static void zad1 (){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = input.nextInt();
        int[][] mass = new int[n][n];
        int t = n-1;
        for (int i=0; i<n;i++){
            for (int j=0;j<n;j++){
                if (j<t){
                    mass[i][j] = 0;
                } else if (j>t) {
                    mass[i][j] = 2;
                } else {
                    mass[i][j] = 1;
                }
            }
            t--;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void zad2 (){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите нечетное число n: ");
        int n = input.nextInt();
        String[][] mass = new String[n][n];
        int t = n-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==(n-1)/2 | j==(n-1)/2 | j==t | j==i){
                    mass[i][j] = "*";
                } else {
                    mass[i][j] = ".";
                }
            }
            t--;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void zad3 (){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = input.nextInt();
        int[][] mass = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j==i){
                    mass[i][j] = 0;
                } else {
                    for (int k=1;k<n;k++){
                        if (j==i+k | j==i-k){
                            mass[i][j] = k;
                            break;
                        }
                    }
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}