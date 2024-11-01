package ru.mirea.lab13.ex5;

public class PhoneFormatter {

    public String formatPhoneNumber(String input) {
        // Удаляем все пробелы и нечисловые символы для упрощения обработки
        String cleanedInput = input.replaceAll("[^\\\\d+]", "");
        String countryCode;
        String phoneNumber;

        // Проверяем формат номера и выделяем код страны и номер
        if (cleanedInput.startsWith("+")) {
            // Формат: +<Код страны><Номер>
            int countryCodeEndIndex = 0;
            while (countryCodeEndIndex < cleanedInput.length() && Character.isDigit(cleanedInput.charAt(countryCodeEndIndex))) {
                countryCodeEndIndex++;
            }
            countryCode = cleanedInput.substring(0, countryCodeEndIndex); // Код страны
            phoneNumber = cleanedInput.substring(countryCodeEndIndex); // Номер
        } else if (cleanedInput.startsWith("8")) {
            // Формат: 8<Номер>
            countryCode = "+7"; // Код страны для России
            phoneNumber = cleanedInput.substring(1); // Номер без ведущей 8
        } else {
            return "Неверный формат телефона.";
        }

        // Проверяем длину номера и формируем итоговый формат
        if (phoneNumber.length() != 10) {
            return "Неверный номер телефона.";
        }

        // Создаем отформатированный номер
        String formattedNumber = String.format("%s%s-%s-%s", countryCode,
                phoneNumber.substring(0, 3),
                phoneNumber.substring(3, 6),
                phoneNumber.substring(6, 10));

        return formattedNumber;
    }

    public static void main(String[] args) {
        PhoneFormatter formatter = new PhoneFormatter();

        // Примеры использования
        System.out.println(formatter.formatPhoneNumber("+79175655655")); // +7 917-565-5655
        System.out.println(formatter.formatPhoneNumber("89175655655"));  // +7 917-565-5655
        System.out.println(formatter.formatPhoneNumber("+104289652211")); // +10 428-965-2211
        System.out.println(formatter.formatPhoneNumber("123456789")); // Неверный номер телефона.
        System.out.println(formatter.formatPhoneNumber("8917abc45def")); // Неверный формат телефона.
    }
}
