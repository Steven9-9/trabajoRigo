package org.example;
import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String nombreUsuario=null;
        String nombreUsuarioBD="steven";
        String contrasena=null;
        String contrasenaBD="123";
        Integer opcion=0;
        Integer opciones=0;
        int intentos=0;


        Scanner leer = new Scanner(System.in);


        while (intentos < 3) {

            System.out.println("************ BIENVENIDO A RIGOBERTO GROSERIA ************");
            System.out.println("Ingresa tu nombre de Usuario:");
            nombreUsuario = leer.nextLine();

            System.out.println("Ingresa tu contraseña:");
            contrasena = leer.nextLine();
            intentos++;

            System.out.println("Numero de intentos " + intentos);



            if (nombreUsuario.equals(nombreUsuarioBD) && contrasena.equals(contrasenaBD)) {

                System.out.println("******* Bienvenido " + nombreUsuario + " **************");
                System.out.println("Elije una opcion: ");

                System.out.println("1. Ingresa Orden. \n" +
                        "2. Modificar Orden.\n" +
                        "3. Terminar Orden y calcular total.\n" +
                        "4. Salir");

                opcion = leer.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.println("******** Ingresa la Orden ************");

                        Integer cantidadCangrejo = 0;
                        Integer cantidadEscalopes = 0;
                        Integer cantidadFilete = 0;
                        Integer cantidadCorvina = 0;
                        Integer cantidadCoctel = 0;
                        Integer cantidadJugos = 0;


                        System.out.println("***** Elije una opcion ************* ");
                        System.out.println("1. Cangrejo de urrao $28000");
                        System.out.println("2. Escalopes a la rigo $35000");
                        System.out.println("3. Filete tour de francia $150000");
                        System.out.println("4. Corvina de rigo $80000");
                        System.out.println("5. Coctel michelle $20000");
                        System.out.println("6. Jugos de urrao $18500");

                        opciones= leer.nextInt();

                        if (opciones == 1) {

                            System.out.println("Ingrese la cantidad que desea: ");
                            cantidadCangrejo = leer.nextInt();

                        } else if (opciones == 2) {
                            System.out.println("Ingrese la cantidad que desea: ");
                            cantidadEscalopes = leer.nextInt();

                        } else if (opciones == 3) {
                            System.out.println("Ingrese la cantidad que desea: ");
                            cantidadFilete = leer.nextInt();

                        } else if (opciones == 4) {
                            System.out.println("Ingrese la cantidad que desea: ");
                            cantidadCorvina = leer.nextInt();
                        }
                        else if (opciones == 5){
                            System.out.println("Ingrese la cantidad que desea: ");
                            cantidadCoctel = leer.nextInt();

                        }else if(opciones==6){
                            System.out.println("Ingrese la cantidad que desea: ");
                            cantidadJugos = leer.nextInt();

                        }else{

                            System.out.println("Opcion Invalida");
                        }

                            break;
                    case 2:

                        System.out.println("******** Modifica la Orden ************");

                        break;
                    case 3:

                        System.out.println("******** Terminar Orden************");

                        int totalSinPropina = ((cantidadCangrejo*28000)+(cantidadCoctel+20000)+(cantidadCorvina*80000)
                                +(cantidadJugos*18500)+(cantidadEscalopes*35000)+(cantidadFilete*150000));

                        System.out.println("Desea agregar propina: ");


                        break;
                    default:

                        break;


                }


            } else {

                System.out.println("Usuario o contraseña incorrectos");


            }}
        System.out.println("Cuenta bloqueada");

}}







