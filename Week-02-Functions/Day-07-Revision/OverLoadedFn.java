public class OverLoadedFn {
    static void add(int a , int b){
        int sum=a+b;
        System.out.println("Sum of two nums is : "+ sum);
    }
    static void add(int a , float b){
        float sum=a+b;
        System.out.println("Sum of two nums is : "+ sum);
    }
    static void add(float a , float b){
        float sum=a+b;
        System.out.println("Sum of two nums is : "+ sum);
    }
    static void add(int a , int b , int c){
        int sum=a+b+c;
        System.out.println("Sum of three nums is : "+ sum);
    }


    public static void main(String[] args) {
        add(4,5); //1st
        add(4,5.0f); //2nd
        add(3.0f,5.0f);  //3rd
        add(3,4,5);     //4th
    }

}
