public class Main {

  public static void main(String[] args) {
    printMegaBytesAndKilobytes(2500);
  }

  static void printMegaBytesAndKilobytes(int kiloBytes) {
    int YY = kiloBytes / 1024;
    int XX = kiloBytes % 1024;

    if (kiloBytes < 0) {
      System.out.println("INVALID");
    } else {
      System.out.println(kiloBytes + " KB = " + YY + " mb" + " and " + XX + " KB");
    }
  }
}
