public class IP {
    public static void main(String[] args) {
        String address = "111.231.234";
        String ans = "";
        for(int i = 0;i<address.length();i++){
            char ch = address.charAt(i);
            if(ch == '.'){
                ans = ans +"[.]";
            }else{
                ans = ans +ch;
            }
        }
        
       System.out.println(ans);
    }
}