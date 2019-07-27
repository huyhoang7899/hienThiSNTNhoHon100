public class hienThiSNTNhoHon100 {
    public static boolean ktSoNguyenTo(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (ktSoNguyenTo(i)) {
                System.out.println(i);
            }
        }
    }
}