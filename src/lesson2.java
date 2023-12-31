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

class lesson2_3 {
    public static void main(String[] args) {
        int num = 10;
        while (num > 0) {
            System.out.println(num);
            num --;
        }
    }
}

class lesson2_4 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

class lesson2_5 {
    public static void main(String[] args) {
        int num = 10;
        while (num > 0) {
            if (num % 7 == 0) {
                break;
            }
            System.out.println(num);
            num --;
        }
    }
}

class lesson2_6 {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

class lesson2_7 {
    public static void main(String[] args) {
        String[] places = {"Tokyo", "Osaka", "Kyoto"};
        for (int i = 0; i <= 2; i++) {
            System.out.println(places[i]);
        }
    }
}

class lesson2_8 {
    public static void main(String[] args) {
        String[] names = {"太郎", "花子", "もりもりマッチョ"};
        System.out.println(names[2]);
        names[2] = "地上最強のおやじ";
        System.out.println(names[2]);
    }
}

class lesson2_9 {
    public static void main(String[] args) {
        String[] places = {"Tokyo", "Osaka", "Kyoto"};
        for (int i = 0; i < places.length; i++) {
            System.out.println(places[i]);
        }
    }
}

class lesson2_10 {
    public static void main(String[] args) {
        String[] names = {"太郎", "花子", "もりもりマッチョ"};
        for (String name: names) {
            System.out.println(name);
        }
    }
}

class lesson2_11 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        int oddSum = 0;
        int evenSum = 0;

        for (int number: numbers) {
            if (number % 2 == 0) {
                evenSum += number;
                System.out.println("偶数の和は"+evenSum+"です");
                continue;
            }
            oddSum += number;
            System.out.println("奇数の和は"+oddSum+"です");
        }
    }
}
