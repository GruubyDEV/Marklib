import java.util.Scanner;

public class Family {

    String name, lastName, login, password, logg, pass, kidName;
    Scanner scan = new Scanner(System.in);
    int chose;
    public void menu() {
        do {
            System.out.println("Family menu");
            System.out.println("1. Login parents");
            System.out.println("2. Login kid");
            System.out.println("3. Add family");
            System.out.println("0. Exit");
            System.out.print("Chose: ");
            chose = scan.nextInt();

            switch (chose) {
                case 1:
                    loginParents();
                    break;
                case 2:
                    //loginKid
                    break;
                case 3:
                    add();
                    break;
            }
        } while (chose != 0);
    }

    public void add() {
        System.out.print("Name: ");
        this.name = scan.nextLine();
        scan.next();
        System.out.print("Last name: ");
        this.lastName = scan.nextLine();
        scan.next();
        System.out.print("Kid name: ");
        this.kidName = scan.nextLine();
        scan.next();
        System.out.print("Password: ");
        this.password = scan.nextLine();
        scan.next();
        this.login = name + lastName;
    }

    public void loginParents() {
        System.out.print("Login (login is your name and last name): ");
        logg = scan.nextLine();
        scan.next();
        System.out.print("Password: ");
        pass = scan.nextLine();
        scan.next();
        if (logg.equals(login) && pass.equals(password)) {
            System.out.println("Hello Mr." + name + ".");
        } else {
            System.out.println("Something went wrong!");

        }
    }
}
