
package boletin7_4;

import java.util.Scanner;

public class Peso {
    Scanner datos=new Scanner(System.in);
    private String nome1;
    private float peso1;
    private String nome2;
    private float peso2;
    
    public void MayorPeso(){
        if (peso1>peso2){
            System.out.println("La persona que más pesa es "+nome1+" con "+peso1+" Kg por una diferencia de "+(peso1-peso2));
        }
        else{
            System.out.println("La persona que más pesa es "+nome2+" con "+peso2+" Kg por una diferencia de "+(peso2-peso1));
        }
    }
    
    public String lerNome1(){
        System.out.println("Escriba el nombre de la primera persona: ");
        nome1=datos.nextLine();
        return nome1;
    }
    public float lerPeso1(){
        System.out.println("Teclea el peso de la primera persona: ");
        peso1=datos.nextFloat();
        return peso1;
    }
    public String lerNome2(){
        datos.nextLine();
        System.out.println("Escriba el nombre de la segunda persona: ");
        nome2=datos.nextLine();
        return nome2;
    }
    public float lerPeso2(){
        System.out.println("Teclea el peso de la segunda persona: ");
        peso2=datos.nextFloat();
        return peso2;
    }
}
