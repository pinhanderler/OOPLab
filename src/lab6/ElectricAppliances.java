package Lab6V2;
import java.util.Scanner;

public class ElectricAppliances{
    private String name;
    private int power;
    private float weight;
    private String color;
    private String manufacturer;
    private boolean pluggedIn;
    private float consumerPower;
    private int frequency;
    protected ElectricAppliances(String n, int p, float w, String c, String m, int f){
        name = n;
        if(p > 0) {
            power = p;
        } if(w > 0) {
            weight = w;
        } color = c;
        manufacturer = m;
        if(f > 0) {
            frequency = f;
        } consumerPower = 0;
    } protected void setpluggedIn(){
        Scanner in = new Scanner(System.in);
        float timeOfPluggedIn;
        System.out.println("На який час ви хочете це увімкнути?");
        timeOfPluggedIn = in.nextFloat();
        pluggedIn = true;
        consumerPower += timeOfPluggedIn * power;
        System.out.println(name + " увімкнено!");
    } protected String outputAppByFrequency(int max, int min){
        if (frequency > min && frequency < max)
            return name + " має частоту в указаному діапазоні.";
        else
            return "";
    }protected int getPower(){
        return power;
    }

    @Override
    public String toString() {
        return "Прилад " + name + " має потужність " + power + ", вагу " + weight +
                ", колір " + color + " частоту: " + frequency + ". Виробник: " + manufacturer +
                "; Був ввімкнений у розетку: " + pluggedIn +
                "; Його спожита потужність: " + consumerPower;
    }

    public void removeApp(){
        name = "";
        power = 0;
        weight = 0;
        color = "";
        manufacturer = "";
        pluggedIn = false;
        consumerPower = 0;
        frequency = 0;
    }
}
