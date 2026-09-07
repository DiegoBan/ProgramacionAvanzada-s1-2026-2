public class ej3 {
    public static void printRoster(int[] roster) {
        System.out.printf("Roster: ");
        for(int i = 0 ; i < roster.length ; i++){
            System.out.printf("%d ", roster[i]);
        }
        System.out.println();
    }
    public static void eliminarRepetidos(int[] roster) {
        for(int i = 0 ; i < roster.length ; i++) {
            for(int j = i + 1 ; j < roster.length ; j++) {
                if(roster[i] == roster[j]) {
                    roster[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] roster = {1, 2, 2, 3, 4, 5, 6, 6, 6, 7, 7, 7, 8, 9, 10, 10, 10, 11, 12, 13, 13, 13, 14, 15, 15, 15};
        printRoster(roster);
        eliminarRepetidos(roster);
        printRoster(roster);
    }
}
