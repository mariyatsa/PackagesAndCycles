
package ru.netology;
public class vacationСalculation {
        public int calc(int income, int expense, int threshold) {

            // income - доход от работы
            // expense - месячные обязательные траты
            // threshold - денег на счету
            int count = 0;
            for (int month = 0; month < 12; month++) {
                if (20000 >= threshold) { // можем ли отдыхать?
                    threshold = threshold + income - expense;
                } else {
                    count++; // увеличиваем счётчик месяцев отдыха
                    threshold = (threshold - expense) / 3;
                }
            }
            return count;
        }
        public int calculate(int income, int expense, int threshold) {

            // income - доход от работы
            // expense - месячные обязательные траты
            // threshold - денег на счету
            int count = 0;
            for (int month = 0; month < 12; month++) {
                if (150000 >= threshold) { // можем ли отдыхать?
                    threshold = threshold + income - expense;
                } else {
                    count++; // увеличиваем счётчик месяцев отдыха
                    threshold = (threshold - expense) / 3;
                }
            }
            return count;
        }
}
