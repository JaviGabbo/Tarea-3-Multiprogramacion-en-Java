package mayusculas;

import java.util.*;

public class HijoM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String palabra = "";

        

        while (!palabra.equals("fin")){
           palabra = sc.nextLine();
            System.out.println(palabra.toUpperCase());
            
        }
    }

}
