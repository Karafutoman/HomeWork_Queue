import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

    private static List<Person> generateClients() {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("Виктор ", "Колобков", 4));
        list.add(new Person("Анатолий ", "Данилюк", 5));
        list.add(new Person("Олег ", "Шматко", 8));
        list.add(new Person("Анатолий ", "Шкалин", 2));
        list.add(new Person("Александр ", "Куренков", 7));

        return list;

    }

    public static void main(String[] args) {

        Deque<Person> deque = new ArrayDeque<>();
        for (Person person : generateClients()) {
            deque.offer(person);
        }

        while (!deque.isEmpty()) {
            Person person = deque.removeFirst();
            System.out.println(person + " прокатился на аттракционе");
            person.useTickets();
            if (person.getTickets() > 0) {
                deque.addLast(person);
            }
        }
    }
}