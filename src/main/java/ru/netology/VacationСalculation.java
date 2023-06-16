
package ru.netology;

public class VacationСalculation {
    public int calc(int income, int expense, int threshold) {

        // income - доход от работы
        // expense - месячные обязательные траты
        // threshold - нужно денег для отпуска
        // money - денег на счету
        int count = 0;

        for (int month = 0; month < 12; month++) {
            if (expense >= threshold) { // можем ли отдыхать?
                threshold = threshold + income - expense;
            } else {
                count++; // увеличиваем счётчик месяцев отдыха
                threshold = (threshold - expense) / 3;
            }
        }
        return count;
    }
}
