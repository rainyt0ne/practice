import java.util.Random;

class lesson2_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x, num;
        x = rnd.nextInt(10);
        num = 5;
        if (num > x) {
            System.out.println("numの勝ち。"+"ちなみにxの数値は"+x+"でした！");
        } else if (num == x) {
            System.out.println("numと同じ。"+"ちなみにxの数値は"+x+"でした！");
        } else {
            System.out.println("numの負け。"+"ちなみにxの数値は"+x+"でした！");
        }
    }
}
