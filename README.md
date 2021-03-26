### Features

- Київський національний політехнічний університет Розробка програмного забезпечення 2020-2021 Весняний термін Розробка програмного забезпечення "Основи розробки програмного забезпечення на Java" лабораторні завдання курсу 


**Table of Contents**

[TOCM]



####Lab1
[Heading link](https://drive.google.com/file/d/1q0bYTD-cqdd7wwDIF0RFkrTZrPL_LSU4/view?usp=sharing)
####Lab2 
[Heading link](https://drive.google.com/file/d/1xj_2AY5HM1D5UWWlcBnuW5e8KACpxzxz/view?usp=sharing)
####Lab3
[Heading link](https://drive.google.com/file/d/1H_iArfwAXIGpR8cI2r1vg9j_DJhgx3hV/view?usp=sharing)
####Lab4 
[Heading link](https://drive.google.com/file/d/1JB8YxlnEnVuXSlMIKduOK1GvouUjmVHB/view?usp=sharing) 
####Lab5
[Heading link](https://drive.google.com/file/d/1xoHtHHIJ02RT8UGan13l1Ifqq49ZRvxI/view?usp=sharing)
####Lab6
[Heading link](https://drive.google.com/file/d/1Zu-U10xR7KpGfZ_NgrEvOgX4qvZnhhMD/view?usp=sharing)
####Lab7
[Heading link](https://drive.google.com/file/d/1EoaPQtLRsht8FGF4Rx7n6HDTVhwe3XyF/view?usp=sharing)
####Lab8
[Heading link](https://drive.google.com/file/d/1-eoueWQM_R1tUFzPbQlh-yijr50_l-3b/view?usp=sharing)


###Code Blocks (multi-language) & highlight

####Java

``` 
package lab1;
import java.util.Scanner;
/**
 * Номер заліковки - 9882
 * C2 = 0; => O1 = "+"
 * C3 = 0; => C = 0
 * C5 = 2; => O2 = "%"
 * C7 = 5; => тип індексів i та j = float
 */
public class Main {
    static boolean checkIsNextWrong(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Value can not be calculated. Incorrect input found");
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        final int C = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A: ");
        final int a = in.nextInt();
        System.out.print("Enter B: ");
        if (checkIsNextWrong(in))
            return;
        final int b = in.nextInt();
        System.out.print("Enter N: ");
        if (checkIsNextWrong(in))
            return;
        final int n = in.nextInt();
        System.out.print("Enter M: ");
        if (checkIsNextWrong(in))
            return;
        final int m = in.nextInt();
        double S = 0;
        if (a < 0 || b < 0 || n < 0 || m < 0) {
            System.out.println("Value can not be calculated. Char can not be negative");
            return;
        }
        if ((a + C <= 0 && n + C >= 0) || b == 0) {
            System.out.println("Value can not be calculated. Dividing by zero found");
            return;
        }
        for (float i = (float) a; i <= (float)n; ++i) {
            for (float j = (float) b; j <= (float)m; ++j) {
                S += i % j / ((double) i + C);
            }
        }
        System.out.println("S = " + S);
        in.close();
    }
}
```


####WriteBy 
#####Gamzenur Uzunlu

<p align="center">
<a href="mailto:pinhanderler@gmail.com" target="_blank" title="Mail"><img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/gmail.svg" alt="pinhanderler@gmail.com" height="30" width="30" /></a> <a href="https://www.instagram.com/pinhanderler" target="_blank" title="Instagram"><img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/instagram.svg" alt="https://www.instagram.com/pinhanderler" height="30" width="30" /></a><a href="https://www.instagram.com/codepinhan" target="_blank" title="Instagram"><a href="https://t.me/pinhanderler" target="_blank" title="Telegram"><img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/telegram.svg" alt="https://t.me/pinhanderler" height="30" width="30" /></a><a href="https://www.linkedin.com/in/gamzenur-uzunlu-95171b1a6/" target="_blank" title="LinkedIn"><img align="center" src="https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/linkedin.svg" alt="https://www.linkedin.com/in/gamzenur-uzunlu-95171b1a6/" height="30" width="30" /></a>
</p>
