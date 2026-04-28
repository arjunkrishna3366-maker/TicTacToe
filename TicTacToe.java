import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int slot = getUserSlot(sc);

        System.out.println("Slot entered: " + slot);
        
        sc.close();
    }

    static int getUserSlot(Scanner scanner) {
        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();
        return slot;
    }
}