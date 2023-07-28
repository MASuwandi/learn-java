public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "child";
        child.doIt();
        System.out.println(child.name);

        // object child assign to variable type parent
        // will make new field base on parent
        // field will be null
        Parent parent = child;
        parent.doIt(); // still doIt from child
        System.out.println(parent.name); // name parent
    }
}
