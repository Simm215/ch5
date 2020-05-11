package secretmessage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SecretMessage {
    public SecretMessage(String path){
        char[] chars = readMessage(path);
        System.out.println(chars);
        int i = 0;
        for(char c :chars){
            if(Character.isUpperCase(c))
                System.out.println(c);
        }
    }
    /*
    git status
    git add.
    git status
    git commit -m "lab5"
    git push origin master
    git status
     */

    public char [] readMessage(String filePath){
        char[] chars = new char[1000];
        try{
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        int c;
        int i = 0;
        while(c=(char)br.read()!=-1) {
            chars[i++] = (char) c;
        }

        }catch (IOException e) {
        e.printStackTrace();
        }
        return chars;
        }
    }

