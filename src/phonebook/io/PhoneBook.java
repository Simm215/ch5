package phonebook.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook {
    private Contact[] contacts;
    public PhoneBook(String inputFileName){
        importContacts(inputFileName);

    }

    private void importContacts(String file){
        contacts = new Contact[10];
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
            String name;
            Long phonenr;
            int i=0;
            while(scanner.hasNext()){
                name = scanner.next();
                if(scanner.hasNextLong()){
                    phonenr = scanner.nextLong();
                    contacts[i] = new Contact(name, phonenr);
                    i++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String toString(){
        String toReturn="";
        for(Contact c : contacts){
            if(c!=null){
                toReturn += c ;
            }
            else
            {
                return toReturn;
            }
        }
        return toReturn;
    }

    public Long getNrByName(String name){
        long number = 0;
        int i=0;
        while (contacts[i]!=null){
            if(contacts[i].getName().equals(name)){
                return contacts[i].getPhonenr();
            } else
                i++;
        }
        return null;
    }
}
