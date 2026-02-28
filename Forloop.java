public class Forloop {
    public static void main(String args[]) {

        int arr[] = {1,2,4,1,3,6,7,8,1,2,1,6,7,9};
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count = count + 1;
            }
        }

        System.out.println(count);
    }
}