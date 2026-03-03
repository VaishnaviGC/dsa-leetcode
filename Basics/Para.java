public class Para {
    
    public static void fun(String s, int n){
        for(int i = 0;i < n;i++){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        fun("consistency" , 4);
        fun("DSA" , 4);
    }
}