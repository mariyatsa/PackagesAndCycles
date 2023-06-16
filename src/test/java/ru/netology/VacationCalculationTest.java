package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationCalculationTest {

    @ParameterizedTest
    @CsvSource({
            "10000,3000,0,6",
            "60000,5000,0,8"
    })
// @CsvFileSource(files = "src/test/resources/Dannue1.csv")
    public void numberOfMonthSatLowCost(int income, int expense, int threshold, int expected) {
        VacationСalculation service = new VacationСalculation();


        // вызываем целевой метод:
        int actual = service.calc(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
