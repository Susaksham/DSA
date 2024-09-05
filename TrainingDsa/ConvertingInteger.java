public class ConvertingInteger {
    public static void main(String[] args) {
        System.out.println(convertingInteger("13042"));

    }
    public static int convertingInteger(String number){
        if(number.length() == 0){
            return 0;
        }
        int digit = ((int)number.charAt(0) - '0');
        return  digit*10 + convertingInteger(number.substring(1  , number.length()));
    }
}
