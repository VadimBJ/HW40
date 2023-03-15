public class Main {
  public static void main(String[] args) {
    Human h1 = new Human("Вася");
    h1.sayHi();
    System.out.println(h1);

    Man m1 = new Man("Mike");
    m1.sayHi();
    System.out.println(m1);

    Woman w1 = new Woman("Margo");
    w1.sayHi();
    System.out.println(w1);
  }
}