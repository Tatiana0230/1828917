
package senasalud;

import java.util.Scanner;

public class SenaSalud {

    public static void main(String[] args) {
String nom,apelli,ed,col;
Scanner nombre= new Scanner(System.in);
System.out.println("Ingrese su nombre");
nom=nombre.next();
System.out.println("Su nombre es:"+nom);
Scanner apellido= new Scanner(System.in);
System.out.println("Ingrese su apellido");
apelli=apellido.next();
System.out.println("Su apellido es:"+apelli);
Scanner edad= new Scanner(System.in);
System.out.println("Ingrese su edad");
ed=edad.next();
System.out.println("Su edad es:"+ed);
Scanner color= new Scanner(System.in);
System.out.println("Ingrese su color favorito");
col=color.next();
System.out.println("Su color favorito es:"+col);
    }
    
}
