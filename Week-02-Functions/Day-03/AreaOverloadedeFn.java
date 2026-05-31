public class AreaOverloadedeFn {
    static double area(int r){
        System.out.println("First called");
        return Math.PI * r *r;
    }
    static double area(float r){
        System.out.println("Second called");
        return Math.PI * r * r;
    }
    static double area(double r){
        System.out.println("third called");
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println(area(7));
        System.out.println(area(12.5));
        System.out.println(area(7.1f));
    }
}
