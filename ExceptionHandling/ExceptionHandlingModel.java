package ExceptionHandling;

public class ExceptionHandlingModel {
    public static void main(String[] args) {
        String str = null;
        string(str);
        int[] arr ={1,2};
        array(arr);
    }
    public static void string(String str){
        try{
            System.out.println(str.length());
        }catch(NullPointerException e) {
            System.out.println("null");
        }
    }

    public static void array(int[] arr){
        try{
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOfBoundException");
        }
    }
}
