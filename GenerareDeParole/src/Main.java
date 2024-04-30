import java.util.*;
public class Main {
    public static void main(String[] args) {

        int lenght = 10;
        System.out.println(Generate_Password(lenght));
    }
    static char[] Generate_Password(int len){
        System.out.println("Generate a random password : ");
        System.out.println("Your new password is : ");
        String Capital_Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_Letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*<>?/=-";
        String values = Capital_Letters + Small_Letters + numbers + symbols;
        Random random_method = new Random();
        char[] password = new char[len];
        for (int i = 0;i<len;i++){
            password[i] = values.charAt(random_method.nextInt(values.length()));
        }
        return password;
    }
}