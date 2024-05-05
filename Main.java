import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(7, 3);
        System.out.println("Wynik dodawania: " + result);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Wynik dodawania to: " + result);
    }
}