public class Woman extends Human {
  public Woman(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return String.format("Женщина по имени %s", super.getName());
  }

  @Override
  public void sayHi() {
    System.out.println("Я родилась!");
  }

}
