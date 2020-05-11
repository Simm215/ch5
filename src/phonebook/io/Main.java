package phonebook.io;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook("./src/ch5/phonebook.io/phonebook");
        System.out.println(pb);

        System.out.println(pb.getNrByName("Andrei"));
    }
}
