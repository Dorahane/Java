package ru.mirea.lab13.ex3;

public class main {
    public static void main(String[] args) {
        String address1 = "Россия, Московская область, Москва, Арбат, 12, 1, 101";
        String address2 = "США, Калифорния, Лос-Анджелес, Холливуд, 100, 2";
        String address3 = "Франс, Иль-де-Франс, Париж, Шанз-Элизе, 45.1., 2";
        String address4 = "Германия, Максимилианштрассе; Берлин; Бранденбург, 9, 1, 12";

        address addr1 = new address(address1);
        address addr2 = new address(address2);
        address addr3 = new address(address3);
        address addr4 = new address(address4);

        System.out.println(addr1);
        System.out.println(addr2);
        System.out.println(addr3);
        System.out.println(addr4);
    }
}
