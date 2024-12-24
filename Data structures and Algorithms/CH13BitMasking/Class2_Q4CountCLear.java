package CH13BitMasking;

public class Class2_Q4CountCLear {
    public static void main(String[] args) {
        int num = 27; // Example number
        int count = countClearedBits(num);
        System.out.println("Number of cleared bits in " + num + ": " + count);
    }

    public static int countClearedBits(int num) {
        int count = 0;

        // Iterate through each bit position
        for (int i = 0; i < Integer.SIZE; i++) {
            // Check if the bit at the current position is cleared (equal to 0)
            if ((num & (1 << i)) == 0) {
                count++; // Increment count if the bit is cleared
            }
        }

        return count;
    }
}
