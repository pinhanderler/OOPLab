package Lab6V2;

public class Laptop extends ElectricAppliances {
    private float screenSize;
    public Laptop(String n, int p, float w, String c, String m, int f, float s){
        super(n, p, w, c, m, f);
        screenSize = s;
    }
}
