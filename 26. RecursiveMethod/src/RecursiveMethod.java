public class RecursiveMethod {
    static void cetak(int a){
        if(a <= 0){
            return;
        }
        else{
        System.out.println(a);
        cetak(a-1);
        }
    }

    public static void main(String[] args) {
        cetak(5);
    }
}
