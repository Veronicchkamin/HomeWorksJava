package Homework5;

public class MainApp {
    public static void main(String[] args) {

        // First student

      StudentClass nona = new StudentClass();

      nona.firstName = "Nona";
      nona.lastName = "Hauffmann";
      nona.age = 33;
      nona.lecturesAttended = 4;

      String nonSum = nona.Summary();

      System.out.println(nonSum);

      String nonNs = nona.NameSurname();

      System.out.println(nonNs);

      String nonNsa = nona.NameSurnameAge();

      System.out.println(nonNsa);

      System.out.println();

      nona.printLecturesAttended();

      System.out.println();

      //присвоение и вывод нового кол-ва лекций
      nona.lecturesAttended = 44;

      nona.printLecturesAttended();

      System.out.println();

        //Second student

        StudentClass den = new StudentClass();

        den.firstName = "Denis";
        den.lastName = "Rostof";
        den.age = 35;
        den.lecturesAttended = 6;

        String denSum = den.Summary();

        System.out.println(denSum);

        String denNs = den.NameSurname();

        System.out.println(denNs);

        String denNsa = den.NameSurnameAge();

        System.out.println(denNsa);

        System.out.println();

        den.printLecturesAttended();

        System.out.println();

        // Third student

        StudentClass sof = new StudentClass();

        sof.firstName = "Sofia";
        sof.lastName = "Krug";
        sof.age = 31;
        sof.lecturesAttended = 8;

        String sofSum = sof.Summary();

        System.out.println(sofSum);

        String sofNs = sof.NameSurname();

        System.out.println(sofNs);

        String sofNsa = sof.NameSurnameAge();

        System.out.println(sofNsa);

        sof.printLecturesAttended();

        System.out.println();
    }
}
