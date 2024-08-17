import java.util.Scanner;

public class exemplosDelf {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("informe o sálario: ");
        double salario = prompt.nextDouble();

        if (salario <=1412){
           salario = salario + (salario/100*12);
            System.out.println("reajuste de 12%");
        } else if(salario<=3000){
            salario = salario + (salario/100*9);
            System.out.println("reajuste de 9%");
        }else if (salario <=5000){
            salario = salario + (salario/100*5);
            System.out.println("reajuste de 5%");
        }else{
        System.out.println("sem reajuste");
    }
        double resultado = salario;
        System.out.println("resultado: " +resultado);
}
}