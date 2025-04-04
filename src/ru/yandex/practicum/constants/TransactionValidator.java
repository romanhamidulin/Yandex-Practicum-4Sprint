package ru.yandex.practicum.constants;

public class TransactionValidator {
    // объявите константы
    final static int MIN_AMOUNT = 1;
    final static int MAX_AMOUNT = 5000;
    // объявите метод isValidAmount()
    public boolean isValidAmount(double amount) {
        // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
        if (amount < MIN_AMOUNT) {
        System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
        return false;
        }
        if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }

}
