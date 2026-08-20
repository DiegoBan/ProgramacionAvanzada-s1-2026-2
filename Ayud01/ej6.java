import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float promedio, promedioTareas;
        System.out.printf("Ingrese promedio: ");
        promedio = scan.nextFloat();
        System.out.printf("Ingrese promedio de tareas: ");
        promedioTareas = scan.nextFloat();
        if(promedio <= 3.5){
            System.out.println("Reprobado");
        } else if (promedio >= 5 && promedioTareas >= 4){
            System.out.println("Aprobado");
        } else {
            System.out.println("A examen");
        }
    }
}
