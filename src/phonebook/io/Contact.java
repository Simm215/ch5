package phonebook.io;

public class Contact {
    private String name;
    private Long phonenr;

    public Contact (String name, Long phonenr){
        this.name = name;
        this.phonenr = phonenr;
    }

    public String getName(){
        return name;
    }

    public Long getPhonenr() {
        return phonenr;
    }

    @Override
    public String toString(){
        return name + " : "+phonenr;
    }
}
