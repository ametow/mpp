package lesson8.lecture.methodreferences.classmethod.math;

public class Item {
  Integer parseInt(String s) {
    return Integer.parseInt(s);
  }

  Integer parse(Item s) {
    return Integer.parseInt(s.toString());
  }

  @Override
  public String toString() {
    return "123";
  }
}
