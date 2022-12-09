import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) throws Exception {
        String embaralhada = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String palavra = sc.next();

        sc.close();
        String[] arrayString = palavra.split("");

        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(arrayString));

        Collections.shuffle(strList);

        for (String letter : strList) {
            embaralhada += letter;
        }

        System.out.println(embaralhada);
    }

    public static int random(int min, int max) {
       int numerorandom = (int) Math.floor(Math.random() * (max - min + 1)) + min;

       return numerorandom;
    }
}