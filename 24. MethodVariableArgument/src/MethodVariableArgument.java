public class MethodVariableArgument {
    public static void main(String[] args) {
        int [] nilai = {
                100, 100, 100, 100
        };
        selamatBUKANVA("Arfian", nilai);
        selamatVA("Arfian", 100,40,50,100,100);
    }
    //TANPA Variabel Argument
    static void selamatBUKANVA(String nama, int[] nilai){
        int total = 0;
        for(var n: nilai){
            total += n;
        }
        int rata = total/nilai.length;
        if (rata >= 80){
            System.out.println(nama + " " + "kamu lulus");
        }else{
            System.out.println(nama + " " + "kamu gagal");
        }
    }
    //Dengan Variable Argument
    static void selamatVA(String nama, int... nilai){
        int total = 0;
        for(var n: nilai){
            total += n;
        }
        int rata = total/nilai.length;
        if (rata >= 80){
            System.out.println(nama + " " + "kamu lulus");
        }else{
            System.out.println(nama + " " + "kamu gagal");
        }
    }
}
