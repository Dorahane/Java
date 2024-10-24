package ru.mirea.lab10.ex1;

public class Student{
    private String name;
    private String surname;
    private String special;
    private int kurs;
    private String group;

    Student(String name, String surname, String special, int kurs, String group){
        this.name = name;
        this.surname = surname;
        this.special = special;
        this.kurs = kurs;
        this.group = group;
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getSurname(){return surname;}
    public void setSurname(String surname){this.surname = surname;}
    public String getSpecial(){return special;}
    public void setSpecial(String special){this.special = special;}
    public int getKurs(){return kurs;}
    public void setKurs(int kurs){this.kurs = kurs;}
    public String getGroup(){return group;}
    public void setGroup(String group){this.group = group;}
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", special='" + special + '\'' +
                ", kurs=" + kurs +
                ", group='" + group + '\'' +
                '}';
    }
}
