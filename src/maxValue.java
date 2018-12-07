public class maxValue {
    public static void main(String[] args) {

        System.out.println("Liet ke cac gia tri");

        int[] money = new int[20];
        for (int i = 0; i < money.length; i++) {
            System.out.println("Nhap gia tri thu " + (i + 1));
            java.util.Scanner input = new java.util.Scanner(System.in);
            money[i] = input.nextInt();
        }

        int max = money[0];
        for (int i = 1; i < money.length; i++) {
            if (max < money[i]) {
                max = money[i];
            }

        }
        System.out.println("Tai san lon nhat trong danh sach la " + max);
    }
}
