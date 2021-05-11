package Lab6V2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class TheMain {
    public static void main(String[] args) {
        ArrayList<ElectricAppliances> listOfElApp = new ArrayList<ElectricAppliances>();
        listOfElApp.add(new Refrigerator("холодильник", 113, (float) 22.6, "white", "Japan", 40));
        listOfElApp.add(new Iron("праска", 2400, (float) 1.7, "purple", "France", 20));
        listOfElApp.add(new Laptop("Сірий ноутбук", 130, (float) 2.2, "grey", "China", 50, (float) 15.6));
        listOfElApp.add(new Laptop("Чорний ноутбук", 90, (float) 1.8, "black", "USA", 35, (float) 14.0));
        //увімкнення приладів в розетку

        int answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Які електроприлади ви хочете увімкнути у розетку?\nВведіть 1, якщо хочете увімкнути " +
                "холодильник; 2 - якщо хочете увімкнути праску; 3 - якщо хочете увімкнути сірий ноутбук; 4 - " +
                "якщо хочете увімкнути чорний ноутбук.");
        while (in.hasNextInt()){
            answer = in.nextInt();
            if (answer < listOfElApp.size() && answer > 0)
                listOfElApp.get(answer - 1).setpluggedIn();
            else
                System.out.println("Значення некоректне.");
            System.out.println("Введіть 1, якщо хочете увімкнути" +
                    "холодильник; 2 - якщо хочете увімкнути праску; 3 - якщо хочете увімкнути ноутбук.");
        }
        System.out.println("Включення в розетку завершене!");
        //підрахування споживчої потужності
        in.next();
        int minFrequency = 0, maxFrequency = 100;
        System.out.println("Задайте діапазон електромагнітного випромінення.\nМінімальна частота ν = ");
        if (in.hasNextInt())
            minFrequency = in.nextInt();
        else in.next();
        System.out.println("Максимальна частота ν = ");
        if (in.hasNextInt())
            maxFrequency = in.nextInt();
        else in.next();
        //Провести сортування приладів у квартирі на основі потужності.
        listOfElApp.sort(Comparator.comparing(ElectricAppliances::getPower));
        for (int i = 0; i < listOfElApp.size(); i++) {
            System.out.println(listOfElApp.get(i).outputAppByFrequency(maxFrequency, minFrequency));
            System.out.println(listOfElApp.get(i).toString());
        }

        System.out.println("Done!");
    }
}
