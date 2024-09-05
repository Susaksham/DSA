import java.util.*;

public class Codeforces_1840C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while(testCase > 0){


            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
//            double count=0;
//            for(int i=0;i<n;){
//                if(arr[i]>q){
//                    i++;
//                    continue;
//                }
//                int tcount=0;
//                while((i<n)&&(arr[i]<=q)){
//                    i++;
//                    tcount++;
//                }
//                if(tcount>=k){
//                    int ab=(tcount-k)+1;
//                    count+=((ab+1)*ab)/2;
//                }
//            }
//            System.out.println(count);
            int len = 0;
            int ans = 0;
            for(int i=0; i < n; i++ ){
                if(arr[i] <=q){
                    len +=1;
                } else{
                    if(len >=k){
                       ans += (len - k + 1) * (len - k + 2)/2;
                    }
                    len = 0;
                }
            }
            if(len >=k){
                ans += (len - k + 1)* (len - k + 2)/2;
            }
            System.out.println(ans);
            testCase--;
        }
    }

}
