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

class lesson2_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(4);
        switch (num) {
            case 1:
                System.out.println("1です");
                break;
            case 2:
                System.out.println("2です");
                break;
            case 3:
                System.out.println("3です");
                break;
            default:
                System.out.println(num+"です");
                break;
        }
    }
}