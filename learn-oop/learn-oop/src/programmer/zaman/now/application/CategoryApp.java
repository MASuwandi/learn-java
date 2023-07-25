package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        category.setId("1");

        System.out.println(category.getId());
        System.out.println(category.isExpensive());

        // w/o setter can update as you like (bad practice)
//        category.id = null;

        category.setId(null);
        System.out.println(category.getId());

    }
}
