package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class vacationCalculationTest {

    @ParameterizedTest
    @CsvSource({
            "10000,3000,0,6",
            "60000,5000,0,8"
    })
// @CsvFileSource(files = "src/test/resources/Dannue1.csv")
    public void numberOfMonthSatLowCost(int income, int expense, int money, int expected) {
        vacationСalculation service = new vacationСalculation();


        // вызываем целевой метод:
        int actual = service.calc(income, expense, money);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
