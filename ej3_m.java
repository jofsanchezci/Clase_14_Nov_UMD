public class ej3_m {
  static int plusMethodInt(int x, int y) {
    return x + y;
  }
  
  static double plusMethodDouble(double x, double y) {
    return x + y;
  }
  
  public static void main(String[] args) {
    int num1 = plusMethodInt(100, 203);
    double num2 = plusMethodDouble(6.334,6.268);
    System.out.println("INT: " + num1);
    System.out.println("DOUBLE: " + num2);
  }
}