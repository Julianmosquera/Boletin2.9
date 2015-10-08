package bol2.pkg9;

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol29 {

    
    public static void main(String[] args) {
        float dinero, b100, b20, b5, m1;
        
        System.out.println("billetes de 100€: ");
        Scanner dato=new Scanner (System.in);
        b100=dato.nextFloat();
        System.out.println("billetes de 20€: ");
        b20=dato.nextFloat();
        System.out.println("Billetes de 5€: ");
        b5=dato.nextFloat();
        System.out.println("Monedas de 1€: ");
        m1=dato.nextFloat();
        
        dinero=b100*100+b20*20+b5*5+m1*1;
        
        System.out.println("dinero:"+dinero);
        
        
        
        
        
        
    }
    
}
