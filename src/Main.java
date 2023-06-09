import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your content: ");
        String content = scanner.nextLine();

        Service service = new Service(content);

        System.out.println(service.characterCounter());
        System.out.println(service.letterCounter());

    }

}