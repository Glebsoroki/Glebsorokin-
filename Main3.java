import java.util.Scanner;
public class Main {

    private static int x = 1;

    public static void main(String[] args) {
        while (x == 1) {
            System.out.println("Работаем? \n1-да \n0-нет");
            Scanner proverka = new Scanner(System.in);
            int konec = proverka.nextInt();
            if (konec == 0) {
                break;

            }
            reshenie();
        }
    }


    public static void reshenie() {
        System.out.println("Что вы хотите? (1-12) - задания");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 31) - 15);
        }
        if (num == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
        } else if (num == 2) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
            System.out.println("");
            for (int b = array.length - 1; b >= 0; b--) {
                System.out.println(b + ")" + array[b]);
            }
        } else if (num == 3) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
            System.out.println("");
            for (int c = 0; c < array.length; c++) {
                if (array[c] % 2 == 0) {
                    System.out.println(c + ")" + array[c]);
                }
            }
        } else if (num == 4) {
            System.out.println("Выводит все элементы массива через");
        } else if (num == 5) {
            for (int d = 0; d < array.length; d++) {
                int d1 = array[d];
                if (d1 == -1) {
                    System.out.println("-1 есть в массиве");
                    break;
                }
                System.out.println(d1);
            }
        } else if (num == 6) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
            System.out.println("");
            System.out.println("Какой элемент вы хотите добавить?");
            double elem = in.nextDouble();
            int[] array1 = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                array1[i] = array[i];
            }
            array1[array.length] = (int) (elem);
            for (int i = 0; i < array1.length; i++) {
                System.out.println(i + ")" + array1[i]);
            }
        } else if (num == 7) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
            System.out.println("");
            System.out.println("Какой элемент вы хотите добавить?");
            double elem = in.nextDouble();
            int[] array1 = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                array1[i + 1] = array[i];
            }
            array1[0] = (int) (elem);
            for (int i = 0; i < array1.length; i++) {
                System.out.println(i + ")" + array1[i]);

            }
        } else if (num == 8) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
            System.out.println("");
            System.out.println("Какой элемент вы хотите добавить?");
            double elem = in.nextDouble();
            System.out.println("В какую позицию?(1-13)");
            double mesto = in.nextDouble();
            double mesto1 = mesto - 1;
            int mesto2 = (int) (mesto1);

            int[] array1 = new int[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                while (i != mesto) {
                    array1[i] = array[i];
                    break;
                }
                array1[i + 1] = array[i];
            }
            array1[mesto2] = (int) (elem);
            for (int i = 0; i < array1.length; i++) {
                System.out.println(i + ")" + array1[i]);

            }
        } else if (num == 9) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
            System.out.println("");

            int[] array1 = new int[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                array1[i] = array[i];
            }
            for (int i = 0; i < array1.length; i++) {
                System.out.println(i + ")" + array1[i]);
            }
        } else if (num == 10) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
            System.out.println("");
            int[] array1 = new int[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                array1[i] = array[i + 1];
            }
            for (int i = 0; i < array1.length; i++) {
                System.out.println(i + ")" + array1[i]);
            }

        } else if (num == 11) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
            System.out.println("");
            System.out.println("Какой элемент вы хотите удалить?");
            int mesto = in.nextInt();
            int mesto1 = mesto - 1;


            int[] array1 = new int[array.length - 1];
            for (int i = 0; i < array1.length; i++) {
                array1[i] = array[i];
                if (i == mesto1) {
                    for (int b = mesto1; b < array1.length; b++) {
                        array1[b] = array[b + 1];
                    }
                    break;
                }

            }

            for (int i = 0; i < array1.length; i++) {
                System.out.println(i + ")" + array1[i]);
            }
        } else if (num == 12) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + ")" + array[i]);
            }
            System.out.println("");
            int[] array2 = new int[12];
            for (int i = 0; i < array2.length; i++) {
                array2[i] = ((int) (Math.random() * 31) - 15);
                System.out.println(i + ")" + array2[i]);
            }
            System.out.println("");
            int[] array3 = new int[array.length + array2.length];
            for (int i = 0; i < array.length; i++) {
                array3[i] = array[i];
            }
            for (int i = 12; i<array3.length;i++) {
                array3[i]=array2[i-12];
            }
            for (int i = 0; i<array3.length;i++){
                System.out.println(i+")"+array3[i]);
            }
        }
        else {
            System.out.println("Erorr");
        }

        System.out.println("Чтобы выйти из программы нажмите - 0 \nЕсли хотите ввернуться в начало нажмите - 1");
        int konec = in.nextInt();
        if (konec == 0) {
            System.exit(0);
        }
    }
}