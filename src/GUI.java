import java.util.Scanner;

public class GUI {
    public void menu() {
        int chose;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome in Marklib menu");
        System.out.println("Chose what you want to do");

        System.out.println("1. Teacher");
        System.out.println("2. Family");

        System.out.print("Chose: ");
        chose = scan.nextInt();

        switch (chose) {
            case 1 -> {
                Teacher teacher = new Teacher();
                teacher.menu();
            }
            case 2 -> {
                Family family = new Family();
                family.menu();
            }
        }

    }
}
