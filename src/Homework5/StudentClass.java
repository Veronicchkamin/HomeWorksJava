package Homework5;

public class StudentClass {
    public String firstName;   // Имя
    public String lastName;    // Фамилия
    public int age;            // Возраст
    public int lecturesAttended; // Количество посещаемых лекций

    public String Summary() {
        String summ = "Name: " + firstName + ", Surname: " + lastName + ", Age: " + age + ", Lectures: " + lecturesAttended;
        return summ;
    }

    public String NameSurname() {
        String ns = "Name: " + firstName + ", Surname: " + lastName;
        return ns;
    }

    public String NameSurnameAge() {
        String nsa = "Name: " + firstName + ", Surname: " + lastName + ", Age: " + age;
        return nsa;
    }
    //метод который не возвращает значение, но выводит сообщение

    public void printLecturesAttended() {
        System.out.println("Number of attended lectures " + lecturesAttended);


    }
}

