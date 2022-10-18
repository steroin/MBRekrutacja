package ex6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class HrService {

    /**
     * Poniższa metoda przyjmuje listę wszystkich pracowników dostępnych w firmie.
     * Chcemy zwrócić mape, w której znajdują się pracownicy zespołu "team_1" pogrupowani według możliwości przejścia na
     * emeryturę.
     * Wymagania:
     * Pracownik który jest gotowy do przejscia na emeryture musi mieć 65 lat lub więcej
     * Pracownik musi być przypisany do zespołu "team_1"
     * Mapa wynikowa musi zawierac 2 klucze: true oraz false.
     * Wartością dla true musi byc lista pracowników gotowych do przejscia na emeryture.
     * Natomiast dla false lista pracowników, którzy jeszcze nie osiagneli wieku emerytalnego
     * Nie usuwaj adnotacji @SuppressWarnings.
     **/

    @SuppressWarnings("all") // don't touch it
    public static HashMap<Boolean, List<Employee>> getAllEmployeesReadyForRetirement(List<Employee> employees) {
        if (employees == null) throw new RuntimeException();
        Map<Boolean, List<Employee>> Employees_Grouped_By_Access_To_Retirement =    new HashMap<>();
        for (int i = 0; i <= employees.size(); i++   ) {
                var employee = employees.get(0);
            if (employee.getTeam() == "team_1") {
        if (employee.getAge() > 65) {
            Employees_Grouped_By_Access_To_Retirement.get(true).add(employee);}
            }}
        return (HashMap<Boolean, List<Employee>>)
                Employees_Grouped_By_Access_To_Retirement;}
}