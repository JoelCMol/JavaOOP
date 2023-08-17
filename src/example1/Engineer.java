package example1;

public class Engineer extends Employee{
    private String specialization;
    public Engineer(String name, String specialization) {
        super(name); // calls the constructor of the superclass
        this.specialization = specialization;
    }

    public String toString() {
        return super.toString() + "\nSpecialization: " + this.specialization;
    }
}
