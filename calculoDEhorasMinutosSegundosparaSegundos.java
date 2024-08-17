import java.util.Scanner;

public class calculoDEhorasMinutosSegundosparaSegundos {
    public static void  main(String[] args){
        Scanner prompt = new Scanner(System.in);
        System.out.print("informe as semanas: ");
        int semanas = prompt.nextInt();
        System.out.print("informe os dias: ");
        int dias = prompt.nextInt();
        System.out.print("informe as horas: ");
        int horas = prompt.nextInt();
        System.out.print("informe as minutos: ");
        int minutos = prompt.nextInt();
        System.out.print("informe as segundos: ");
        int segundos = prompt.nextInt();

        //int horas=5,minutos=30,segundos=35,resultado;
        int resultado = (semanas*7*24*60*60) + (dias*24*60*60) + (horas*60*60) + (minutos*60) + segundos;
        System.out.println("segundos: " +resultado);
    }
}
