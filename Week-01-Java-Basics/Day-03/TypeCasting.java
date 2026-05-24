public class TypeCasting {
    public static void main(String[] args) {
        // implicit type casting :java automatic converts small type in large one
        int a = 5;
        double num = a;
        System.out.println("num is :" + num);

        //explicit type casting
        double marks=75.8;
        int m=(int)marks;
        System.out.println("Marks after type casting: "+m);
    }
}
