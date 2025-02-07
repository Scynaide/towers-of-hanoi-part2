public class Tower {

    private static void towerOfHanoi(int n, char from_tower, char to_tower, char aux_tower){

        if (n == 0) {
            return;
        }

        towerOfHanoi (n - 1, from_tower, aux_tower, to_tower);
        System.out.println("Move disk " + n + " from tower "
                + from_tower + " to tower "
                + to_tower);
        towerOfHanoi(n - 1, aux_tower, to_tower, from_tower);
    }

    public static void main(String[] args) {

        int N = 3;

        // A, B and C are names of towers
        towerOfHanoi(N, 'A', 'C', 'B');
    }
}
