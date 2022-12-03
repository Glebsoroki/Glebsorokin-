import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("Выберите номер задания (1-11)");
            ch = scan.nextInt();
            if (1 == ch) {
                double a = (101 + 0) / 3;
                System.out.println(a);
                double b = 0.000003 * 10000000.1;
                System.out.println(b);
                boolean c = true && true;
                System.out.println(c);
                boolean d = false && true;
                System.out.println(d);
                boolean e = (false && false) | (true && true);
                System.out.println(e);
                boolean f = (false && false) && (true && true);
                System.out.println(f);
            } else {
                if (ch == 2) {
                    Long n1, n2, n3, n4;
                    System.out.println("Введите 1,2,3 и 4 число");
                    n1 = scan.nextLong();
                    n2 = scan.nextLong();
                    n3 = scan.nextLong();
                    n4 = scan.nextLong();
                    if (n1 == n2) {
                        if (n1 == n3) {
                            if (n1 == n4) {
                                System.out.println("Равно");
                            }
                        }
                    } else {
                        System.out.println("Не равно");
                    }
                } else {
                    if (3 == ch) {
                        System.out.println("Введите k");
                        int k = scan.nextInt();
                        Double[] n1 = new Double[20];
                        Double n6 = 0.0, n7 = 0.0;
                        for (int n5 = 0; n5 < 20; n5++) {
                            n1[n5] = Math.random() * (100) + 0;
                            System.out.println((n5 + 1) + ")" + n1[n5]);
                        }
                        for (int n4 = 0; n4 < k; n4++) {
                            for (int n2 = 0; n2 < 20; n2++) {
                                if (n1[n2] > n6) {
                                    n6 = n1[n2];
                                    n7 = n6;
                                }
                            }
                            for (int n3 = 0; n3 < 20; n3++) {
                                if (n1[n3].equals(n7)) {
                                    n1[n3] = 0.0;
                                    System.out.println("Наибольшее " + n6);
                                    n6 = 0.0;
                                }
                            }
                        }
                    } else {
                        if (ch == 4) {
                            System.out.println("Введите k");
                            int k = scan.nextInt();
                            Double[] n1 = new Double[20];
                            Double n6 = 101.0, n7 = 101.0;
                            for (int n5 = 0; n5 < 20; n5++) {
                                n1[n5] = Math.random() * (100) + 0;
                                System.out.println((n5 + 1) + ")" + n1[n5]);
                            }
                            for (int n4 = 0; n4 < k;n4++) {
                                for (int n2 = 0; n2 < 20;n2++) {
                                    if (n1[n2] < n6) {
                                        n6 = n1[n2];
                                        n7 = n6;
                                    }
                                }
                                for (int n3 = 0; n3 < 20; n3++) {
                                    if (n1[n3].equals(n7)) {
                                        n1[n3] = 1000.0;
                                        System.out.println("Наименьшее " + n6);
                                        n6= 101.0;
                                    }
                                }
                            }
                        } else {
                            if (ch == 5) {
                                Double[] n1 = new Double[20];
                                Double sum = 0.0;
                                for (int n2 = 0; n2 < 20;n2++) {
                                    n1[n2] = Math.random() * (100) + 0;
                                    System.out.println((n2 + 1) + ")" + n1[n2]);
                                    sum = sum + n1[n2];
                                }
                                sum = sum / 20;
                                System.out.println(sum);
                                for (int n2 = 0;n2 < 20; n2++) {
                                    if (n1[n2] > sum) {
                                        System.out.println("Больше среднего значения " + n1[n2]);
                                    }
                                }
                            } else {
                                if (ch == 6) {
                                    int n1, n2, n3;
                                    n3 = 0;
                                    System.out.println("Введите 1 число");
                                    n1 = scan.nextInt();
                                    System.out.println("Введите 2 число");
                                    n2 = scan.nextInt();
                                    for (int n4 = 0; n4 < n2; ) {
                                        n3 = n3 + n1;
                                        n4++;
                                    }
                                    System.out.println(n3);
                                } else {
                                    if (ch == 7) {
                                        int[] n1 = new int[20];
                                        for (int n3 = 0; n3 < 20; n3++) {
                                            n1[n3] = (int) (Math.random() * (100) + 0);
                                            System.out.println((n3 + 1) + ")" + n1[n3]);
                                        }
                                        for (int n2 = 0; n2 < 20;n2++) {
                                            if (n1[n2] % 2 != 0) {
                                                System.out.println(n1[n2] + " Нечет");
                                            } else
                                                System.out.println(n1[n2] + " Чет");
                                        }
                                    } else {
                                        if (ch == 8) {
                                            Double C, F;
                                            System.out.println("Введите Температуру в F");
                                            C = scan.nextDouble();
                                            F = (C - 32) / 1.8;
                                            System.out.println(F);
                                        } else {
                                            if (ch == 9) {
                                                Double h, m, imt;
                                                System.out.println("Введите рост");
                                                h = scan.nextDouble();
                                                System.out.println("Введите вес");
                                                m = scan.nextDouble();
                                                imt = m / (h * h);
                                                System.out.println(imt);
                                            } else {
                                                if (ch == 10) {
                                                    double n2, n3, n4;
                                                    System.out.println("Введите n1");
                                                    double n1 = scan.nextDouble();
                                                    n2 = Math.pow(n1, 2);
                                                    System.out.println(n2);
                                                    n3 = Math.pow(n1, 3);
                                                    System.out.println(n3);
                                                    n4 = Math.pow(n1, 4);
                                                    System.out.println(n4);
                                                } else {
                                                    if (ch == 11) {
                                                        System.out.println("Введите сторону a");
                                                        int a = scan.nextInt();
                                                        System.out.println("Введите сторону b");
                                                        int b = scan.nextInt();
                                                        System.out.println("Введите сторону c");
                                                        int c = scan.nextInt();
                                                        if (a + b > c) {
                                                            if (a + c > b) {
                                                                if (b + c > a)
                                                                    System.out.println("Могут");
                                                                else
                                                                    System.out.println("Не могут");
                                                            } else
                                                                System.out.println("Не могут");
                                                        } else
                                                            System.out.println("Не могут");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}