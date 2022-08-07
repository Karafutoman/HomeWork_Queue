public class Person {

    String name;
    String surname;
    int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;

    }

    public boolean useTickets() {
        if (tickets > 0) {
            tickets--;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTickets() {
        return tickets;
    }

    @Override
    public String toString() {
        return name + surname + " осталось билетов для использования " + tickets + " шт.";
    }


}
