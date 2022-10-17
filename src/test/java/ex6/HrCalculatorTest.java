package ex6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HrCalculatorTest {

    @Test
    void shouldReturnValidMap() {
        Map<Boolean, List<Employee>> actual = HrService.getAllEmployeesReadyForRetirement(employeesTestData());
        assertThat(actual)
                .isNotEmpty()
                .containsAllEntriesOf(Map.of(true, expectedRetiredEmployee(), false, expectedNotRetiredEmployee()));
    }

    @Test
    void shouldThrowExceptionWhenOneOrMoreEmployeesDoNotHaveTeam() {
        assertThrows(UnassignedEmployeeException.class, () -> HrService.getAllEmployeesReadyForRetirement(employeesNoTeamTestData()));
    }

    @Test
    void shouldThrowException2() {
        List<Employee> emptyList = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> HrService.getAllEmployeesReadyForRetirement(emptyList));
    }

    @Test
    void shouldThrowException3() {
        assertThrows(IllegalArgumentException.class, () -> HrService.getAllEmployeesReadyForRetirement(null));
    }

    private List<Employee> employeesTestData() {
        return List.of(
                Employee.of("Jan", "Kowalski", 20, "team_1"),
                Employee.of("Olga", "Kowalska", 60, "team_1"),
                Employee.of("Edward", "Kowalski", 68, "team_1"),
                Employee.of("Łukasz", "Kowalski", 49, "team_1"),
                Employee.of("Edyta", "Kowalska", 19, "team_1"),
                Employee.of("Piotr", "Kowalski", 65, "team_1"),
                Employee.of("Sebastian", "Kowalski", 48, new String("team_1")),
                Employee.of("Marta", "Kowalska", 28, "team_1"),
                Employee.of("Dorota", "Kowalska", 55, "team_1"),
                Employee.of("Dawid", "Kowalski", 70, "team_1"),
                Employee.of("Justyna", "Kowalska", 18, "team_1"),
                Employee.of("Kasia", "Kowalska", 49, "HR"),
                Employee.of("Tomasz", "Kowalski", 30, "COE"),
                Employee.of("Magda", "Kowalska", 28, "COE")
        );
    }

    private List<Employee> employeesNoTeamTestData() {
        return List.of(
                Employee.of("Jan", "Kowalski", 20, "team_1"),
                Employee.of("Olga", "Kowalska", 60, "team_1"),
                Employee.of("Edward", "Kowalski", 68, "team_1"),
                Employee.of("Łukasz", "Kowalski", 49, "team_1"),
                Employee.of("Edyta", "Kowalska", 19, "team_1"),
                Employee.of("Piotr", "Kowalski", 65, ""),
                Employee.of("Sebastian", "Kowalski", 48, "team_1"),
                Employee.of("Marta", "Kowalska", 28, "team_1"),
                Employee.of("Dorota", "Kowalska", 55, "team_1"),
                Employee.of("Dawid", "Kowalski", 70, new String("team_1")),
                Employee.of("Justyna", "Kowalska", 18, null),
                Employee.of("Kasia", "Kowalska", 49, "     "),
                Employee.of("Tomasz", "Kowalski", 30, "COE"),
                Employee.of("Magda", "Kowalska", 28, "COE")
        );
    }

    private List<Employee> expectedRetiredEmployee() {
        return List.of(
                Employee.of("Edward", "Kowalski", 68, "team_1"),
                Employee.of("Piotr", "Kowalski", 65, "team_1"),
                Employee.of("Dawid", "Kowalski", 70, "team_1"));
    }

    private List<Employee> expectedNotRetiredEmployee() {
        return List.of(
                Employee.of("Jan", "Kowalski", 20, "team_1"),
                Employee.of("Olga", "Kowalska", 60, "team_1"),
                Employee.of("Łukasz", "Kowalski", 49, "team_1"),
                Employee.of("Edyta", "Kowalska", 19, "team_1"),
                Employee.of("Sebastian", "Kowalski", 48, "team_1"),
                Employee.of("Marta", "Kowalska", 28, "team_1"),
                Employee.of("Dorota", "Kowalska", 55, "team_1"),
                Employee.of("Justyna", "Kowalska", 18, "team_1"));
    }
}