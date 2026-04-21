public class TicTacToeUC4 {

    // Method to convert slot to row & column
    public static int[] convertToIndex(int slot) {
        int index = slot - 1;   // convert to 0-based

        int row = index / 3;
        int col = index % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int slot = 5; // example input

        int[] position = convertToIndex(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}