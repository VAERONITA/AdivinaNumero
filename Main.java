
import java.io.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VAERON
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numero numer=new Numero();
        numer.GenerateNum();
        int Salir=0;
        int entrada=0;
        
        BufferedReader numin=new BufferedReader(new InputStreamReader(System.in));
        
        
            numer.GenerateNum();
            System.out.println(numer.GetNum());
            System.out.println("Adivina un numero entre 1 y 100");
            int Correcto=0;
            while(Correcto==0)
            {
                System.out.println("Tienes solo "+numer.getOPor()+" Oportunidades ");
                try{
                    entrada=Integer.parseInt(numin.readLine());
                }catch (IOException e){
                    System.out.println("Error");
                }
                
                numer.Adivina(entrada);
            }        
    }
}
