package com.company;

public class RabinKarpAlgo {
    public static void main(String[] args) {
        String str = "aabbccddeeddff";
        String pattern = "ddee";
        int q = 101;
        rabinKarp(str , pattern , q);
        search(pattern, str, q);
        System.out.println(search1(pattern , str, q));;
    }
    public static void rabinKarp(String text , String pattern , int q){
        int d = 256;// d is the number of character

        int N = text.length();
        int M = pattern.length();
        int  txt =0 ;
        int ptn = 0;
        int h=1;
        for(int k=1; k<pattern.length();k++){
            h = (h * d ) % q;
        }
        for(int k=0; k<pattern.length();k++){
            txt = (txt * d + text.charAt(k))%q;
            ptn = (ptn * d + pattern.charAt(k))%q;
        }
        for(int i=0; i <= (text.length() - pattern.length());i++){
            int patternIndex= 0;
            int matchingIndex = i;
            boolean flag = true;
            if(txt == ptn){
                while(matchingIndex < (i+ pattern.length())){
                    if(text.charAt(matchingIndex) != pattern.charAt(patternIndex)){
                        flag = false;
                        break;
                    }
                    matchingIndex++;
                    patternIndex++;

                }
                if(flag){
                    System.out.println(i);
                }
            }

            //it can get negative because of the remainder it makes the large number into small
            if(i < N-M){
                txt = (d*(txt - text.charAt(i) * h) + text.charAt(i+ pattern.length()))%q;
            }

            if(txt < 0){
                txt = txt + q;
            }
        }


    }
    static int d= 256;
    static void search(String pat, String txt, int q)
    {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        for (i = 0; i < M-1; i++)
            h = (h*d)%q;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++)
        {
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + txt.charAt(i))%q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++)
        {

            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters one by one
            if ( p == t )
            {
                /* Check for characters one by one */
                for (j = 0; j < M; j++)
                {
                    if (txt.charAt(i+j) != pat.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == M)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if ( i < N-M )
            {
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;

                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
            }
        }
    }
    static boolean search1(String pat, String txt, int q)
    {
        // Your code here
        int h=1;
        for(int i=0; i<pat.length()-1; i++){
            h = (h*d) % q;

        }
        int p = 0;
        int t = 0;
        for(int i=0; i< pat.length();i++){
            p = (p*d + pat.charAt(i))%q;
            t = (t*d + txt.charAt(i))%q;
        }

        for(int index=0; index<=(txt.length() - pat.length()) ; index++){
            if(p == t){
                boolean flag = true;
                for(int i=0; i<pat.length();i++){
                    if(pat.charAt(i) != txt.charAt(index + i) ){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return true;
                }
            }
            if(index < (txt.length() - pat.length())){
                t = (d*(t  - h*txt.charAt(index) )+ txt.charAt(index + pat.length())) % q;

            }
            if(t < 0){
                t = t + q;
            }

        }
        return false;
    }
}
