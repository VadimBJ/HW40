public class Human {
  private final String name;

  public Human(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return String.format("Человек по имени %s", name);
  }

  public void sayHi() {
    System.out.println("Я родился!");
  }

}
