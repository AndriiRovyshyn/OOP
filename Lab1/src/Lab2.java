import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        Random rand = new Random();
        Scanner sk = new Scanner(System.in);
        try {
            System.out.println("Введіть кількість рядків матриці А:");
            int m1 = sk.nextInt();
            System.out.println("Введіть кількість стовпців матриці А:");
            int n1 = sk.nextInt();
            System.out.println("Введіть кількість рядків матриці B (Має співпадати з кількістю стовпців матриці A):");
            int m2 = sk.nextInt();
            System.out.println("Введіть кількість стовпців матриці B:");
            int n2 = sk.nextInt();
            double[][] matA = new double[m1][n1];
            double[][] matB = new double[m2][n2];
            double[][] matС = new double[m1][n2];
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n1; j++) {
                    double a = rand.nextDouble();
                    matA[i][j] = a;
                    if (j < n1 - 1) {
                        System.out.print(matA[i][j] + " ");
                    } else {
                        System.out.println(matA[i][j]);
                    }
                }
            }
            System.out.println();
            for (int i = 0; i < m2; i++) {
                for (int j = 0; j < n2; j++) {
                    double a = rand.nextDouble();
                    matB[i][j] = a;
                    if (j < n2 - 1) {
                        System.out.print(matB[i][j] + " ");
                    } else {
                        System.out.println(matB[i][j]);
                    }
                }
            }
            System.out.println();
            if (n1 == m2) {
                for (int i = 0; i < m1; i++) {
                    for (int j = 0; j < n2; j++) {
                        for (int k = 0; k < m2; k++) {
                            matС[i][j] += matA[i][k] * matB[k][j];
                        }
                        if (j < n2 - 1) {
                            System.out.print(matС[i][j] + " ");
                        } else {
                            System.out.println(matС[i][j]);
                        }
                    }
                }
                double maximum = matС[0][0];
                double minimum = matС[0][0];
                for (int i = 0; i < matС.length; i++) {
                    for (int j = 1; j < n2; j = j * 2 - 1) {
                        if (matС[i][j] > maximum) {
                            maximum = matС[i][j];
                        }
                    }
                    sum1 += maximum;
                }
                for (int i = 0; i < matС.length; i++) {
                    for (int j = 0; j < n2; j += 0) {
                        if (matС[i][j] < minimum) {
                            minimum = matС[i][j];
                        }
                    }
                    sum2 += minimum;
                }
                System.out.print("Сума максимальних: " + sum1);
                System.out.print("Сума мінімальних: " + sum2);
            } else {
                System.out.println("Введені невірні значення!" + "\n" + "Множення неможливе.");
            }
        } catch (Exception e) {
            System.out.println("Не вірне значення кількості рядків або(та) стовпців матриці.");
        }
    }
}

