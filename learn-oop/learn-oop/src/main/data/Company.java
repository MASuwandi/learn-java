package main.data;

public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Inner Class
    public class Employee {

        private String name;

        // Access outer method
        public String getCompany() {
            return Company.this.name;
            // or
            // return Company.this.getName();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
