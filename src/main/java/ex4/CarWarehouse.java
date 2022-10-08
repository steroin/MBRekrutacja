package ex4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CarWarehouse {

    /**
     Poniższa metoda przyjmuje listę wszystkich modeli samochodów dostępnych w magazynie.
     Chcemy zwrócić listę wynikową, w której znajdują się modele dostępne do sprzedaży.
     Model jest dostępny do sprzedaży jeśli:
     * Istnieje przynajmniej jedna sztuka dostępna w magazynie (pole quantity oznacza liczbę dostępnych sztuk).
     * Model został dopuszczony do ruchu (pole registered mówi o tym czy model jest dopuszczony do ruchu).
     * Model posiada pełny pakiet ubezpieczenia OC/AC (pole insurancePackage, nie wszystkie modele posiadają
     jakikolwiek pakiet ubezpieczenia).
     Modele w wynikowej liście powinny być posortowane alfabetycznie wg nazwy marki samochodu (pole brand to nazwa marki).
     Nie usuwaj adnotacji @SuppressWarnings.
     **/

    @SuppressWarnings("all") // don't touch it
    public static ArrayList<Car> getAvailableCarsWithFullInsurance(List<Car>cars) throws IllegalArgumentException{
        if(cars==null)
        {new IllegalArgumentException("Cars list cannot be null");
        }
        ArrayList<Car> result_list = new ArrayList<>();
        for (Car car : cars) {
            if (car.getQuantity() >= 0 || car.isRegistered()== true) {
                if (car.getInsurancePackage() == "OC/AC")
                {
                    result_list.add(car);
                }
            }
        }
        result_list.stream()
                .sorted((car1, car2) -> car2.getBrand().compareTo(car1.getBrand()))
                .collect(Collectors.toList());return result_list;
    }
}