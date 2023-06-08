
package ru.netology;

public class vacationСalculation {
    public int calc(int income, int expense, int money) {

        // income - доход от работы
        // expense - месячные обязательные траты
        // threshold - нужно денег для отпуска
        // money - денег на счету
        int count = 0;
        int threshold = 20000;
        for (int month = 0; month < 12; month++) {
            if (threshold >= money) { // можем ли отдыхать?
                money = money + income - expense;
            } else {
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expense) / 3;
            }
        }
        return count;
    }
}
