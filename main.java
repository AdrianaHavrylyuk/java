/**
 * Клас "людина" із дочірнім класом "працівник"
 * @autor Гаврилюк Андріана 302 група
 * @version 1.0
*/

import java.time.LocalDate;

public class main {
    public static void main(String[] args)

    {
        Employee Person1 = new Employee();

        Person1.setId(35);
        Person1.setFirstName("John");
        Person1.setLastName("Wick");
        Person1.setSex(Sex.MALE);
        Person1.setJob(Job_List.Driver);
        Person1.setSalary(23400);
        Person1.setBirthdate(LocalDate.of(1992, 5, 13));


        Person Person2 = new Person();

        Person2.setId(27);
        Person2.setFirstName("Anna");
        Person2.setLastName("Jenson");
        Person2.setSex(Sex.FEMALE);
        Person2.setBirthdate(LocalDate.of(1996, 2, 23));

        System.out.println(Person1.toString());
        System.out.println(Person2.toString());

        System.out.print("\nId1:" + Person1.hashCode() + " = Id2:" + Person2.hashCode() + " - " + Person1.equals(Person2) + "\n");

        Employee Person3 = new Employee().new Implem().setId(12).setFirstName("Kate").setSex(Sex.MALE).build();
        System.out.println(Person3.toString());

    }
}