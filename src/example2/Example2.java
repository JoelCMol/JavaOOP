package example2;

public class Example2 {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setIdNumber(50);

        Engineer e2 = new Engineer("John", "Computer Security");
        e2.setIdNumber(100);
        System.out.println(e2);

        System.out.println(employee);

        MechanicalEngineer e3 = new MechanicalEngineer("John", "Web Developer");
        e3.setIdNumber(123);
        e3.setPeLicenceNumber("123456789");
        System.out.println(e3);
    }
}
