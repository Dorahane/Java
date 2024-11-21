package ru.mirea.lab19.ex1;

class InvalidInnException extends Exception {
    public InvalidInnException(String message) {
        super(message);
    }
}

class client {
    private String name;
    private String inn;

    public client(String fullName, String taxIdentificationNumber) {
        this.name = fullName;
        this.inn = taxIdentificationNumber;
    }

    public String getName() {
        return name;
    }

    public String getInn() {
        return inn;
    }
    public void validateINN() throws InvalidInnException {
        if (!isValidINN(inn)) {
            throw new InvalidInnException("Недействительный ИНН для клиента: " + name);
        }
    }
    private boolean isValidINN(String tin) {
        return (tin.matches("\\d{10}") || tin.matches("\\d{12}"));
    }
}
