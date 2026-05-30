public class Scope {

    //local scope : - a variable declared inside a fn is only accessible to that fn only
    static void local(){
        int a=5;
        System.out.println(a);
    }
    public static void main(String[] args) {
        //a gives error as it is not accessible outside local fn
        // System.out.println(a);
        local();

        if(true){
            int b=100;
            System.out.println(b);
        }

        // System.out.println(b); Error
        
    }
}