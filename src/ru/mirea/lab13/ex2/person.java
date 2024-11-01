package ru.mirea.lab13.ex2;


public class person {
    private String surname;
    private String name;
    private String otch;

    public person(String lastName, String firstName, String patronymic) {
        this.surname = lastName;
        this.name = firstName;
        this.otch = patronymic;
    }

    public String getFullName() {
        StringBuilder fullNameBuilder = new StringBuilder(surname);
        fullNameBuilder.append(" ");

        // добавим имя, если оно не пустое
        if (name != null && !name.trim().isEmpty()) {
            fullNameBuilder.append(name.charAt(0)).append(".");
            fullNameBuilder.append(" ");
        }
        // добавим отчество, если оно не пустое
        if (otch != null && !otch.trim().isEmpty()) {
            fullNameBuilder.append(otch.charAt(0)).append(".");
        }
        return fullNameBuilder.toString();
    }

    public static void main(String[] args) {
        person person1 = new person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFullName());

        person person2 = new person("Петров", "Петр", null);
        System.out.println(person2.getFullName());

        person person3 = new person("Сидоров", null, null);
        System.out.println(person3.getFullName());
    }
}

