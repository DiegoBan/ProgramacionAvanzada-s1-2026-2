import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String binario = "";
        if(N < 0) {
            System.out.printf("El número debe ser positivo\n");
        }else if(N == 0) {
            binario = "0";
            System.out.printf("Binario = %s\n", binario);
        }else {
            while(N > 0) {
                binario = N % 2 + binario;
                N = N / 2;
            }
            System.out.printf("Binario = %s\n", binario);
        }
    }
}
