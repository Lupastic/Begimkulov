public class Main {
    public static int find_minimum(int[] m, int index) {
        if (index == m.length - 1) {
            return m[index];
        }
        return Math.min(m[index], find_minimum(m, index + 1));
    }
    public static void main(String[] args) {
        int[] m = {10,1,32,3,45};
        int min = find_minimum(m, 0);
        System.out.println("minimum element in array is " + min);
    }
}
