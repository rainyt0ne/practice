/*“Hello World”と表示するプログラムを作成しなさい。*/
class lesson1_1 {
    public static void main(String[] args) {
      System.out.println("Hello Java");
    }
}

/*int 型の変数 x に数値 11 を代入し、x の値を“x=11”のように表示するプログラムを作成しなさい。 */
class lesson1_2 {
  public static void main(String[] args) {
    int x;
    x = 11;
    System.out.println("x=" + x);
  }
}

/*int 型の変数 x、y に数値 13、17 を代入し、x、y の値を“x=13,y=17”のように表示するプログラムを作成しなさい。 */
class lesson1_3 {
  public static void main(String[] args) {
    int x;
    int y;
    x = 13;
    y = 17;
    System.out.println("x="+x+",y="+y);
  }
}

/*int 型の変数 x に数値 13 と 17 の和を代入し、x の値を表示するプログラムを作成しなさい。 */
class lesson1_4 {
  public static void main(String[] args) {
    int x;
    x = 13 + 17;
    System.out.println(x);
  }
}

/*数値 13 と 17 の積を表示するプログラムを作成しなさい。ただし、変数を使用しないこと。 */
class lesson1_5 {
  public static void main(String[] args) {
    System.out.println(13*17);
  }
}

/*次のプログラムを作成しなさい。

int 型の変数 x に数値 7 を代入する。
変数 x の値を 3 倍にする。
変数 x の値を表示する。
変数 x の値を半分（1/2）にする。
変数 x の値を表示する。 */
class lesson1_6 {
  public static void main(String[] args) {
    int x;
    x = 7;
    x *= 3;
    System.out.println("x="+x);
    x /= 2;
    System.out.println("x="+x);
  }
}

/*int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成しなさい。 */
class lesson1_7 {
  public static void main(String[] args) {
    int x, y, t;

    x = 5;
    y = 3;
    t = x;

    x = y;
    y = t;

    System.out.println("x="+x+",y="+y);
  }
}