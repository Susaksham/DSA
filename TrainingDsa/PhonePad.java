public class PhonePad {
    public static void main(String[] args) {
    String str = "23";
    int index  = 0;
    String[] arr = {"+" , "", "abc" , "def" , "ghi" , "jkl" , "mno", "pqrs", "tuv", "wxyz"};
    phonePad(str , 0 , arr , "");
    }
    public static void phonePad(String str , int index , String[] arr , String result){

        if(str.length() == index){
            System.out.println(result);
            return;
        }
        for(int i=0; i< arr[str.charAt(index) - '0'].length() ; i++){

            phonePad(str ,index + 1  , arr , result + arr[str.charAt(index) - '0'].charAt(i));

        }


    }
}
