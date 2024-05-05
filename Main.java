import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
import company.beans.Person;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        final int b = 10;
        
        try {
            people[0] = new Person("Aleksandra Wójcik", 23);
            people[1] = new Person("Adam Kowalski", 30);
            people[2] = new Person("Mikołaj Nowak", 42);
            people[3] = new Person("Oliwia Lis", 21);
            people[4] = new Person("Mateusz Wilk", 27);
            
            for (int i = 0; i < people.length; i++) {
                int newValue = MathUtils.add(people[i].getAge(), b);
                String message = "Nowa wartość: " + people[i].getName() + ": " + newValue;
                
                Messenger messenger = new EmailMessenger();
                messenger.sendMessage(message);
            }
        } catch (Exception e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}