package lesson7.lecture.defaultmethodrules.inherit;

public interface SubIntface extends Intface, MineInt {
  @Override
  default void myMethod(int param1) {
    Intface.super.myMethod(param1); // or MineInt.super.myMethod(param1, param2);
  }
}
