import java.util.Scanner;

public class ej2{
    public static void printMatriz(int[][] matriz){
        System.out.printf("Matriz (%d x %d):\n", matriz.length+1, matriz[0].length+1);
        for(int i = 0 ; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[i].length ; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void scanMatriz(int[][] matriz, Scanner scan){
        for(int i = 0 ; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[i].length ; j++){
                System.out.printf("Ingrese valor de posición (%d, %d): ", i+1, j+1);
                matriz[i][j] = scan.nextInt();
            }
        }
    }
    public static void buscarMayor(int[][] matriz, int[] menor){
        for(int i = 0 ; i < matriz.length ; i++){
            for(int j = 0 ; j < matriz[i].length ; j++){
                if(matriz[i][j] > matriz[menor[0]][menor[1]]){
                    menor[0] = i;
                    menor[1] = j;
                }
            }
        }
    }
    public static void Batman(int[][] matriz, int[] menor){
        System.out.printf("Batman: A combatir el crimen...\n");
        matriz[menor[0]][menor[1]] = matriz[menor[0]][menor[1]] <= 5 ? 0 : matriz[menor[0]][menor[1]] - 5;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] gotham = new int[6][6];
        int[] menor = {0, 0};
        scanMatriz(gotham, scan);   //  Ingresa valores de gotham
        printMatriz(gotham);    //  Imprime la matriz
        buscarMayor(gotham, menor); //  busca valor mayor de matriz
        System.out.printf("Cuadricula con valor mayor: (%d, %d)\nEntregando valor a Batman...\n", menor[0]+1, menor[1]+1);
        Batman(gotham, menor);
        printMatriz(gotham);
        scan.close();
    }
}
