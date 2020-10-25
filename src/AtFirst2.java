public class AtFirst2 {
  public String atFirst(String str) {
    int len = str.length();

    if (len == 0) {
      return "@@";
    } else if (len == 1) {
      return (str.charAt(0) + "@");
    } else {
      return str.substring(0, 2);
    }
  }
}
