package numAleatorios;

import java.io.*;
import java.util.*;

public class Padre {
    public static void main(String[] args) {

        ProcessBuilder pb = new ProcessBuilder("Java", "-jar", "numAleatorios.jar");
        Scanner sc = new Scanner(System.in);

        try {
            Process p = pb.start();
            OutputStream out = p.getOutputStream();
            PrintStream ps = new PrintStream(out); //Sirve para enviar al hijo
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader bf = new BufferedReader(isr); //Sirve para recibir del hijo

            String palabra = "";

            while (!palabra.equals("fin")){
                palabra = sc.nextLine();
                ps.println(palabra);
                ps.flush();

                if (!palabra.equals("fin")) {
                	String num = bf.readLine();
                    System.out.println(num);
                }
                
                

                
            }
            ps.close();
            bf.close();


        }catch (IOException e){}







    }
}
