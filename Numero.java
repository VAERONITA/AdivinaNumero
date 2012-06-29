
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VAERON
 */
public class Numero {
    
    Random Aleatorio=new Random();
    private int num=3,opor=100;
    
    public int getOPor()
    {
        return this.opor;
    }
    public void setOpor(int op)
    {
        this.opor=op;
        JOptionPane.showMessageDialog(null,"el numero de oportunidades ha cambiado ahora tienes "+this.opor+" oportunidades");
    }
    
    public void Numero() {
        this.num=Aleatorio.nextInt(100);
    }
    public void GenerateNum()
    {
        this.num=Aleatorio.nextInt(100);
    }
    public int GetNum()
    {
        return this.num;
    }
    public int Adivina(int a)
    {
        if(opor>0)
        {
            opor--;
            if(a==this.num)
            {
                System.out.println("Felicidades el Numero es "+a);
                return 1;
            }
            if(a>this.num)
            {
                System.out.println("El numero es menor");
            }
            if(a<this.num)
            {
                System.out.println("El numero es mayor");
            }
            return 0;
        }
        else
        {
            System.out.println("Lo siento se te acabaron las oportunidades el numero era "+this.num);
            return 0;
        }
        
    }
    
}
