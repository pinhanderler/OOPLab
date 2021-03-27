package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;

/**
 * Номер заліковки - 9882
 * C5 = 2; => C = A + B
 * C7 = 5; => тип елементів char
 * C11 = 4; => сума найбільших елементів в 
 * рядках матриці з парними номерами та найменших 
 * елементів в рядках матриці з непарними номерами
 */

public class Main {
    static boolean checkIsNextWrong(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Incorrect file data");
            return true;
        }
        return false;
    }

    static void enterArray(Scanner in, int n, int m, char[][] a) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                a[i][j] = (char) in.nextLong();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static char[][] sumArrays(char[][] a, char[][] b, int n, int m){
        char[][] c = new char[n][m];
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[i].length; ++j){
                c[i][j] = (char) (a[i][j] + b[i][j]);
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        return c;
    }

    static char findRowMax(char[] row) {
        return Collections.max(row);
    }

    static char findRowMin(char[] row) {
        return Collections.min(row);
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File("lab2/input.txt");
            Scanner in = new Scanner(inputFile);
            if (checkIsNextWrong(in))
                return;
            int n = in.nextInt();
            if (checkIsNextWrong(in))
                return;
            int m = in.nextInt();
            System.out.println("Матриця А: ");
            char[][] a = new char[n][m];
            enterArray(in, n, m, a);
            System.out.println("Матриця B: ");
            char[][] b = new char[n][m];
            enterArray(in, n, m, b);
            System.out.println("Матриця A + B");
            char[][] c = sumArrays(a, b, n, m);
            char sum = 0;
            for(int i = 0; i < n; i++) {
                if (i % 2 == 0)
                  sum += findRowMax(c[i]);
                else
                  sum += findRowMin(c[i]);
            }
            System.out.println("Сума: " + sum);
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не знайдено");
            e.printStackTrace();
        }
    }
}
