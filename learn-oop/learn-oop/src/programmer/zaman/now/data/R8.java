package programmer.zaman.now.data;

// multiple interface
public class R8 implements Car
//        , IsMaintenance
{

    // must have same type as interface
    // public and return type must be same
    public void drive() {
        System.out.println("Drive R8!");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Audi";
    }

    public boolean isMaintenance() {
        return false;
    }
}
