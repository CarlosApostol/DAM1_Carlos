package POO.Student;

public class main {
    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.getStudyCredits());
        ollie.study(1);
        System.out.println("Study credits " + ollie.getStudyCredits());

    }
}
