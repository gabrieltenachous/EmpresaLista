/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolista;

/**
 *
 * @author gabri
 */
public class Employee {
    private String name;
    private Integer id;
    private Double salary;

    public Employee(String name, Integer id, Double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    public void aumentaSalario(double percentual){
        salary+= salary*percentual/100;
    }
    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + ", salary=" + salary + '}';
    }

}
