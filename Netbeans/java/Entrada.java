//Nome:Victor Ribeiro Calado
//RA: 2313553

import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

    public class Entrada{

        public String EntradaTec(String texto){

            System.out.printf("%s",texto);
            InputStreamReader a = new InputStreamReader(System.in);
            BufferedReader b = new BufferedReader(a);
            String s = "";
            try{

                s = b.readLine();

            }
            catch(IOException e){

                System.out.println("ERROR");

            }

            return s;

        }
    }
