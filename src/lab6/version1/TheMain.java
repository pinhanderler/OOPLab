package Lab6;
import java.util.Scanner;

public class TheMain {
    public static void main(String[] args) {
        ElectricAppliances refr1 = new Refrigerator("холодильник", 113, (float)22.6, "white", "Japan", 40);
        Iron iron1 = new Iron("праска", 2400, (float)1.7, "purple", "France", 20);
        Laptop laptop1 = new Laptop("Сірий ноутбук", 130, (float)2.2, "grey", "China", 50, (float)15.6);
        Laptop laptop2 = new Laptop("Чорний ноутбук", 90, (float)1.8, "black", "USA", 35, (float)14.0);

        //увімкнення приладів в розетку
        int answer;
        Scanner in = new Scanner(System.in);
        System.out.println("Які електроприлади ви хочете увімкнути у розетку?\nВведіть 1, якщо хочете увімкнути " +
                "холодильник; 2 - якщо хочете увімкнути праску; 3 - якщо хочете увімкнути сірий ноутбук; 4 - " +
                "якщо хочете увімкнути чорний ноутбук.\n" +
                "Якщо хочете перейти до наступної дії - введіть 0.");
        answer = in.nextInt();
        while (answer != 0){
            switch (answer){
                case 1:
                    refr1.setpluggedIn();
                    break;
                case 2:
                    iron1.setpluggedIn();
                    break;
                case 3:
                    laptop1.setpluggedIn();
                    break;
                case 4:
                    laptop1.setpluggedIn();
                default:
                    System.out.println("Значення некоректне.");
            }System.out.println("Введіть 1, якщо хочете увімкнути" +
                    "холодильник; 2 - якщо хочете увімкнути праску; 3 - якщо хочете увімкнути ноутбук.\n" +
                    "Якщо хочете перейти до наступної дії - введіть 0.");
            answer = in.nextInt();
        }
        //підрахування споживчої потужності
        System.out.println("Споживча потужність приладів:");
        refr1.outputOfConsumerPower();
        iron1.outputOfConsumerPower();
        laptop1.outputOfConsumerPower();
        laptop2.outputOfConsumerPower();

        //Провести сортування приладів у квартирі на основі потужності.


        int minFrequency, maxFrequency;
        System.out.println("Задайте діапазон електромагнітного випромінення.\nМінімальна частота ν = ");
        minFrequency = in.nextInt();
        System.out.println("Задайте діапазон електромагнітного випромінення.\nМаксимальна частота ν = ");
        maxFrequency = in.nextInt();
        refr1.outputAppByFrequency(maxFrequency, minFrequency);
        iron1.outputAppByFrequency(maxFrequency, minFrequency);
        laptop1.outputAppByFrequency(maxFrequency, minFrequency);
        laptop2.outputAppByFrequency(maxFrequency, minFrequency);

        System.out.println("Done!");
    }
}