/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2.ernesto.guevara;

import java.util.Scanner;

/**
 *
 * @author ernes
 */
public class Lab2ErnestoGuevara {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");

        while (true) {
            System.out.println("*** Bienvenido al Menu ***");
            System.out.println("1. Cadena");
            System.out.println("2. Notas");
            System.out.println("3. Clases");
            System.out.println("4. Salir");
            int op = lea.nextInt();

            if (op == 1) {
                int contador = 0, maximo = 0, repeticiones = 0, control = 0, veces = 0;
                char letraMasRepetida = '\0';

                System.out.println("Ingrese una palabra: ");
                String palabra = lea.next();
                int indice = 0;

                while (indice < palabra.length()) {
                    char letra = palabra.charAt(indice);
                    contador = 0;

                    if (palabra.charAt(contador) == letra) {
                        repeticiones++;
                    }
                    contador++;

                    if (repeticiones > maximo) {
                        letraMasRepetida = letra;
                        veces = repeticiones;
                    }
                    indice++;
                }
                System.out.println("La letra mas repetida de " + palabra + " es: " + letraMasRepetida);
                System.out.println("Se repite " + repeticiones + " veces");
            }
            
            if(op==2){
                
                double nota=0, notamenor=100, notamayor=0, sumanotas=0, promedio=0;
                int contador=1;
                
                System.out.println("Cuantas notas quiere ingresar: ");
                int cantidad=lea.nextInt();
                
                while(contador<=cantidad){
                    System.out.println("Nota #"+contador+" : ");
                    nota=lea.nextInt();
                    
                    if(nota>0 && nota<100){
                        sumanotas+=nota;
                        contador++;
                        
                        if(nota<notamenor){
                            notamenor=nota;
                        }
                        
                        if(nota>notamayor){
                            notamayor=nota;
                        }
                    }
                }
                
                promedio=sumanotas/cantidad;
                
                String promedioStr=String.format("El promedio es %.2f", promedio);
                System.out.println(promedioStr);
                System.out.println("La nota menor es: "+notamenor);
                System.out.println("La nota mayor es: "+notamayor);
                
            }
            
            if(op==3){
                System.out.println("Ingrese la fecha del dia de hoy con el formato [dia, DD/MM]: ");
                String fecha=lea.next();
                int coma=fecha.indexOf(",");
                int pleca=fecha.indexOf("/");
                int fin=fecha.length();
                String dia=fecha.substring(0,coma).toLowerCase();
                String fechadiastring=fecha.substring(coma+2,pleca);
                String fechamesstring=fecha.substring(pleca+1,fin);
                
                int fechadia=Integer.parseInt(fechadiastring);
                int fechames=Integer.parseInt(fechamesstring);
                
                if(fechadia>31 && fechames>12){
                    System.out.println("NO EXISTE ESTE DIA");
                    break;
                }
                
                if(dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles")){
                    
                    String nivel=(dia.equals("lunes"))? "Basico"
                            :(dia.equals("martes"))? "Intermedio"
                            :(dia.equals("miercoles"))?"Avanzado":null;
                    
                    System.out.println("Hoy es dia de "+nivel+" Cuantos estudiantes aprobaron?: ");
                    double aprobados=lea.nextInt();
                    
                    System.out.println("Cuantos estudiantes no aprobaron?: ");
                    double reprobados=lea.nextInt();
                    
                    double totalalumnos=aprobados+reprobados;
                    double porcentaje=(aprobados/totalalumnos)*100;
                    
                    System.out.println("El porcentaje de aprobados fue de: "+porcentaje+" %");
                }
                
                if(dia.equals("jueves")){
                    
                    String nivel="Practica Hablada";
                    System.out.println("Hoy es dia de :"+nivel+" Ingrese el porcentaje de asistencia: ");
                    int porcentaje=lea.nextInt();
                    
                    if(porcentaje>50){
                        System.out.println("Asistio la Mayoria");
                    }
                    
                    if(porcentaje<50){
                        System.out.println("No Asistio la Mayoria");
                    }
                }
                
                if(dia.equals("viernes")){
                    String nivel="Ingles para Extranjeros";
                    System.out.println("Hoy es dia de "+nivel);
                    if(fechadia==1 && fechames==1 || fechadia==1 && fechames==7){
                        System.out.println("Comienzo de nuevo ciclo");
                        System.out.println("Cuantos alumnos ingresaran: ");
                        int alumnos=lea.nextInt();
                        System.out.println("Cual es el precio a pagar: ");
                        double precio=lea.nextDouble();
                        
                        double pago=alumnos*precio;
                        
                        System.out.println("El total a pagar: "+pago);
                    }else System.out.println("No es inicio de ciclo");
                }               
            }
            
            if(op==4){
                System.out.println("Nos vemos");
                break;
            }
        }

    }

}
