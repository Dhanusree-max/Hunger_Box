package collections;

public class ParkingLot {

        public static int parkingLot(int[] a) {
            int max = 0;
            int prev = -1;

            for (int i = 0; i < a.length; i++) {
                if (a[i] == 1) {
                    if (prev == -1) {
                        max = i; // leading zeros
                    } else {
                        max = Math.max(max, (i - prev) / 2);
                    }
                    prev = i;
                }
            }

            // trailing zeros
            max = Math.max(max, a.length - 1 - prev);

            return max;
        }

        public static void main(String[] args) {

            System.out.println(parkingLot(new int[]{0, 0, 0, 1})); // 2

        }
    }

