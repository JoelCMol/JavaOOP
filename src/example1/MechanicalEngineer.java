package example1;

public class MechanicalEngineer extends Engineer{
    private String peLicenceNumber;
    public MechanicalEngineer(String name, String specialization) {
        super(name, specialization); // calls the constructor of the superclass
    }

    public void setPeLicenceNumber(String peLicenceNumber) {
        this.peLicenceNumber = peLicenceNumber;
    }

    public String toString() {
        return super.toString() + "\nPE Licence Number: " + this.peLicenceNumber;
    }
}
