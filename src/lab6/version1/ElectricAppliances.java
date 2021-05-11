package Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class ElectricAppliances implements Comparable<ElectricAppliances> {
    private String name;
    private int power;
    private float weight;
    private String color;
    private String manufacturer;
    private boolean pluggedIn;
    private float consumerPower;
    private int frequency;

    protected ElectricAppliances(String n, int p, float w, String c, String m, int f) {
        name = n;
        if (p > 0) {
            power = p;
        }
        if (w > 0) {
            weight = w;
        }
        color = c;
        manufacturer = m;
        if (f > 0) {
            frequency = f;
        }
        consumerPower = 0;
    }

    protected void setpluggedIn() {
        Scanner in = new Scanner(System.in);
        float timeOfPluggedIn;
        System.out.println("На який час ви хочете це увімкнути?");
        timeOfPluggedIn = in.nextFloat();
        pluggedIn = true;
        consumerPower += timeOfPluggedIn * power;
        System.out.println(name + "увімкнено!");
    }

    protected void outputOfConsumerPower() {
        System.out.println(name + " спожив " + consumerPower + " ват");
    }

    protected void outputAppByFrequency(int max, int min) {
        if (frequency < min && frequency < max) {
            System.out.println(name + " має частоту в указаному діапазоні.");
        }
    }

    protected int getPower() {
        return power;
    }

    @Override
    public int compareTo(ElectricAppliances o) {
        int result = this.power - o.power;
        return result;
    }
}
