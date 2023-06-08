package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class vacationCalculationTest {

    @ParameterizedTest
    @CsvSource({
            "10000,3000,0,3",
            "60000,5000,0,7"
    })
// @CsvFileSource(files = "src/test/resources/Dannue1.csv")
    public void numberOfMonthSatLowCost(int income, int expense, int threshold, int expected) {
        vacationСalculation service = new vacationСalculation();
        // переменные подставили в public void
        // подготавливаем данные:
        //int income = 10_000;
        //int expense = 3_000;
        //int threshold = 0;
        //int expected = 3;

        // вызываем целевой метод:
        int actual = service.calc(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
