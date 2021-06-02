public class MethodOverloading {
    public static void main(String[] args) {
        concat("Sapi", "Kambing");
        concat("Ayam","Bebek", "Itik");
    }
    static void concat (String a, String b){
        System.out.println(a+" "+b);
    }
    static void concat (String a, String b, String c){
        System.out.println(a+" "+b+" "+c);
    }
}
