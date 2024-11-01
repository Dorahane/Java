package ru.mirea.lab13.ex5;

public class Number {
    private String phoneNum;

    public Number(String phoneNumber) {
        this.phoneNum = phoneNumber;
    }

    private String resNum(String locNum) {
        return locNum.substring(0, 3) + "-" + locNum.substring(3, 6) + "-" + locNum.substring(6);
    }

    private String euNum(String number) {
        String locNum = number.substring(1);
        int ind = locNum.length()-11;
        String countryCode = locNum.substring(0, ind+1);
        locNum= locNum.substring(ind+1);
        if (locNum.length() != 10) {
            return("Неправильный номер для международного формата.");
        }

        return "+" + countryCode + " " + resNum(locNum);
    }

    private String rusNum(String number) {
        String localNumber = number.substring(1);
        if (localNumber.length() != 10) {
            return("Неправильный номер для российского формата.");
        }

        return "+7 " + resNum(localNumber);
    }

    public String format() {
        String endNum;
        if (phoneNum.startsWith("+")) {
            endNum = euNum(phoneNum);
        } else if (phoneNum.startsWith("8")) {
            endNum = rusNum(phoneNum);
        } else {
            return ("Неверный формат телефонного номера.");
        }
        return endNum;
    }

    public static void main(String[] args) {
        Number num1 = new Number("+79175655655");
        System.out.println(num1.format());
        Number num2 = new Number("89175655655");
        System.out.println(num2.format());
        Number num3 = new Number("+104289652211");
        System.out.println(num3.format());
    }
}