class lesson1_1 {
    public static void main(String[] args) {
      System.out.println("Hello Java");
    }
}

class lesson1_2 {
  public static void main(String[] args) {
    int x;
    x = 10;
    System.out.println("x=" + x);
  }
}

class lesson1_3 {
  public static void main(String[] args) {
    int x;
    int y;
    x = 10;
    y = 15;
    System.out.println("x="+x+",y="+y);
  }
}

class lesson1_4 {
  public static void main(String[] args) {
    int x;
    x = 13 + 17;
    System.out.println(x);
  }
}

class lesson1_5 {
  public static void main(String[] args) {
    System.out.println(13*17);
  }
}

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