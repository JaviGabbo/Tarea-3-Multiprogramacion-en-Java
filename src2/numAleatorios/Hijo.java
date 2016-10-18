package numAleatorios;

import java.util.*;

public class Hijo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String palabra = " ";

        int num1=0;
        int num2=10;

        while (!palabra.equals("fin")){
            sc.nextLine();
            //if (!palabra.equals("fin")) {
            	int numAleatorio=(int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
                System.out.println(numAleatorio);
			//}
            
        }
    }

}
