public class BinOps {
    public String sum(String a, String b) {
        int intResult = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(intResult);
    }

    public String mult(String a, String b) {
        int intResult = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        return Integer.toBinaryString(intResult);
    }
}
