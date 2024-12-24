

public class Q11LeaderElement {
    public static void main(String[] args) {
        int arr[] = {12, 4, 13, 3, 6, 8, 43, 5, 17};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] >= arr[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.println("Leader element is: " + arr[i]);
            }
        }
    }
}
