package lesson7.lecture.interfacestatic;

public enum Consts {
  COMPANY("Microsoft"),
  SALES_TARGET(2000000);

  String v;
  int v2;
  Consts(String i) {
    v = i;
  }
  Consts(int i) {
    v2 = i;
  }

}
