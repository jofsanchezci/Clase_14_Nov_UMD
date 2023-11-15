 public class ej1_m {
  static void nombre(String fname) {
    System.out.println(fname + " Perez");
  }
  static void nombre_edad(String fname, int age) {
    System.out.println(fname + " Perez" + " tiene " + age + " años");
  }

  public static void main(String[] args) {
    nombre("Luis");
    nombre("Juan");
    nombre("Ana");
    System.out.println("++++++++++++++++++++");
    nombre_edad("Luis", 5);
    nombre_edad("Juan", 8);
    nombre_edad("Ana", 31);

  }
}