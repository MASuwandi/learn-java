package main.classes;

import java.util.Objects;

public class ObjectsApp {

    public static class Data {
        String name;
        private String data;

        public Data(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Data product = (Data) o;

            return Objects.equals(data, product.data);
        }

        @Override
        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        // test NullPointerException
        execute(null);

//        execute(new Data("Bob"));
    }

    public static void execute(Data data) {

        // not good, NullPointerException potentially happen
        // System.out.println(data.toString());
        // System.out.println(data.hashCode());

        // Data product = new Data();
        // Data product2 = new Data();

        // # Code: Tanda / Tanpa Objects
        if (data != null) {
            System.out.println(data.toString());
            System.out.println(data.hashCode());
            System.out.println(data.equals(data));
        }

        // # Code: Dengan Objects
        // error handled by logic in method
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));
        System.out.println(Objects.equals(data, data));

    }
}
