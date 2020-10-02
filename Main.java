public class Main {
    public static void main(String[] args) {

    Employee[] employees = new Employee[5];
    setEmployee(employees);
    
        for (int i = 0; i < employees.length; i++) {

            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].toString());
            }
        }



    }
    static void setEmployee(Employee [] employees){
        employees[0] =
                new Employee("Ivanov Ivan Ivanovich",
                        "expert",
                        "ivanov@mail.ru",
                        "89639948264",
                        100000.0F,
                        (byte) 40
                );
        employees[1] =
                new Employee("Petrov Petr Petrovich",
                        "leading specialist",
                        "petrov@mail.ru",
                        "89631234455",
                        60000.0F,
                        (byte) 25
                );
        employees[2] =
                new Employee("Sidorov Ivan Petrovich",
                        "leading specialist",
                        "sidorov@mail.ru",
                        "89631112233",
                        55000.0F,
                        (byte) 43
                );

        employees[3] =
                new Employee("Medvedev Sergey Ivanovich",
                        "main specialist",
                        "medvedev@mail.ru",
                        "89639991221",
                        65000.0F,
                        (byte) 32
                );

        employees[4] =
                new Employee("Smirnov Maxim Sergeevich",
                        "main specialist",
                        "smirnov@mail.ru",
                        "89605552552",
                        65000.0F,
                        (byte) 29
                );
    }

}
