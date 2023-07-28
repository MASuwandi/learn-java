package main.application;

import main.data.Company;

public class NestedApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("company");

        Company.Employee employee = company.new Employee();
        employee.setName("employee");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("company2");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("employee2");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
