package ex6;

public class Employee {
    private final String name;
    private final String lastName;
    private final int age;
    private final String team;

    private Employee(String name, String lastName, int age, String team) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.team = team;

    }

    public static Employee of(String name, String lastName, int age, String team) {
        return new Employee(name, lastName, age, team);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (!name.equals(employee.name)) return false;
        if (!lastName.equals(employee.lastName)) return false;
        return team.equals(employee.team);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        result = 31 * result + team.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", team='" + team + '\'' +
                '}';
    }
}