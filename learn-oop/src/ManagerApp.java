public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager(null);
        manager.name = "Odin";
        manager.sayHello("Thor");

        var vp = new VicePresident(null);
        vp.name = "Rocket";
        vp.sayHello("Groot");

        System.out.println(manager);
        System.out.println(vp);
    }
}
