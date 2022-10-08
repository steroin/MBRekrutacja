package ex4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarWarehouseTest {

    @Test
    void shouldReturnValidList() {
        var list = List.of(
                new Car("BMW", "X7", 500000.0, 5, "OC", true),
                new Car("Seat", "Ibiza", 80000, 11, "OC/AC", true),
                new Car("Volkswagen", "Passat", 130000.0, 0, "OC/AC", true),
                new Car("Opel", "Insignia", 140000, 3, "OC", true),
                new Car("Mercedes", "GLC Coupe", 240000, 3, null, true),
                new Car("Tesla", "Y", 330000.0, 3, "OC/AC", false),
                new Car("Renault", "Megane", 105000, 8, new String("OC/AC"), true),
                new Car("Tesla", "3", 250000, 1, "OC/AC", true),
                new Car("Audi", "A3", 120000, 2, "OC/AC", true)
        );

        assertThat(CarWarehouse.getAvailableCarsWithFullInsurance(list)).containsExactly(
                new Car("Audi", "A3", 120000, 2, "OC/AC", true),
                new Car("Renault", "Megane", 105000, 8, "OC/AC", true),
                new Car("Seat", "Ibiza", 80000, 11, "OC/AC", true),
                new Car("Tesla", "3", 250000, 1, "OC/AC", true)
        );
    }

    @Test
    void shouldThrowExceptionWhenNullProvided() {
        assertThrows(IllegalArgumentException.class, () -> CarWarehouse.getAvailableCarsWithFullInsurance(null));
    }
}