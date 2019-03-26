public class HexConverter {
    public static void main(String[] args) {

        int[] arr = { 11, 6, 42, 5, 10, 14, 7, 15 };
        for (int i : arr) {
            convertToHex(i);
        }
    }

    public static void convertToHex(int dec) {
        String digits = "0123456789ABCDEF";
        String result = "";
        
        while (dec > 0) {
            int digit = dec % 16; 
            result = digits.charAt(digit) + result;
            //System.out.println(result);
            dec = dec / 16;
        }
        System.out.println(result);
    }
}
