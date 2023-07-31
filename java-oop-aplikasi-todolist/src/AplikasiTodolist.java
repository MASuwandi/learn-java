public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        // Dev Test
        // dummy data
//        addTodoList("satu");
//        addTodoList("dua");
//        addTodoList("tiga");
//        addTodoList("empat");
//        addTodoList("lima");

//        testAddTodoList();
//        testShowTodoList();
//        testRemoveTodoList();
//        testInput();
//        testViewShowTodoList();
//        testViewAddTodoList();
//        testViewRemoveTodoList();

        // Post Dev Test
        viewShowTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        System.out.println("TODOLIST");
        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null)
                System.out.println(no + ". " + todo);
        }
        System.out.println("\n");
    }

    public static void testShowTodoList() {
        model[0] = "Learn Java Dasar";
        model[1] = "Java Basics: Application Todolist";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(String todo) {
        // cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;

                // tambah ke posisi yg data array nya null
                model[i] = todo;
                break;
            }
        }
        if (isFull == false) return;

        // jika penuh, resize ukuran array 2x lipat
        var temp = model;
        model = new String[model.length * 2];

        // alokasi data yg sebelumnya di tampung
        for (int i = 0; i < temp.length; i++) {
            model[i] = temp[i];
        }

        // tambah ke posisi yg data array nya null
        model[temp.length] = todo;

    }

    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh todo ke: " + i);
        }

        showTodoList();
    }

    /**
     * Menghapus todo dari list
     */
    public static boolean removeTodoList(Integer number) {
        // get number input from 1
        // check max data
        var idx = number - 1;
        if ((idx) >= model.length)
            return false;

        // check if number assign not already null
        if (model[idx] == null)
            return false;

        // if input valid
        // remove adn readjust position
        for (int i = idx; i < model.length - 1; i++)
            model[i] = model[i + 1];

        model[model.length - 1] = null;

        return true;
    }

    public static void testRemoveTodoList() {
        // should false, current max data 10
        var result = removeTodoList(11);
        System.out.println(result); // false

        // should false, data 4 still null
        result = removeTodoList(6);
        System.out.println(result); // false

        // should success
        result = removeTodoList(2);
        System.out.println(result); // true, // show 4 data

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        // waiting for input from terminal
        // when enter click, method give return to invoker.
        return scanner.nextLine();
    }

    public static void testInput() {
        var name = input("Name");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("Menu : ");
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("x. Exit Program");

            var input = input("Choose");
            if (input.equals("1"))
                viewAddTodoList();
            else if (input.equals("2"))
                viewRemoveTodoList();
            else if (input.equals("x"))
                break;
            else
                System.out.println("Command not found");

        }
    }

    public static void testViewShowTodoList() {
        viewShowTodoList();
    }

    /**
     * Menampilkan view menambah todo list
     */
    public static void viewAddTodoList() {
        System.out.println("Add Todo List");

        var todo = input("Todo (x For Abort Mission)");
        if (todo.equals("x")) {
            // batal
        } else
            addTodoList(todo);
    }

    public static void testViewAddTodoList() {
        viewAddTodoList();

        showTodoList();
    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodoList() {
        System.out.println("Remove Todolist");

        var number = input("Deleted Number (x For Abort Mission)");

        if (number.equals("x")) {
            // batal
        } else {
            var success = removeTodoList(Integer.valueOf(number));
            if (success == false)
                System.out.println("Failed to remove todolist : " + number);
        }
    }

    public static void testViewRemoveTodoList() {
        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
