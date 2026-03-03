public class Ascii {
    public static void main(String[] args) {
        String s = "hello";
       
        int ans = 0;
         for(int i = 0;i < s.length()-1;i++){
          int a = i;
          int b = i+1;
          char first = s.charAt(a);
          char second = s.charAt(b);
          int aasc = first;
          int basc = second;
          int temp = Math.abs(aasc - basc);
          ans = ans + temp;
       }
          System.out.println(ans);
       
        
    }
}