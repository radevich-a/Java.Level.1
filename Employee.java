public class Employee {
    private String FIO;
    private String position;
    private String email;
    private String telephone;
    private float salary;
    private byte age;

    public String getFIO() {
        return FIO;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public float getSalary() {
        return salary;
    }

    public byte getAge() {
        return age;
    }

    public Employee(String FIO, String position, String email, String telephone, float salary, byte age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FIO='" + FIO + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void displayInformation(){
        System.out.println(String.format("FIO %s", this.FIO));
    }
}
