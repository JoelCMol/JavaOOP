package example1;

public class Employee {
    private int idNumber;
    private String name;

    public Employee() {
        this.name = "No name!";
    }

    public Employee(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String toString() {
        return "Name: " + this.name + "\nID Number: " + this.idNumber;
    }
}
