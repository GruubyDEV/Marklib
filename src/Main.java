public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("This is a pre-alpha Marklib system.");
        System.out.println("Use it carefuly and report bugs.");
        Thread.sleep(1000);

        GUI gui = new GUI();
        gui.menu();
    }
}