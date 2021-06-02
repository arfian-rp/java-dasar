import javax.swing.*;

public class BreakDanContinue {
    //break:menghentikan pengulangan;
    //continue:menghentikan pengulangan saat ini dan dilanjutkan pengulangan saat ini
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++){
            if(n==3){
                continue;
            }
            if(n==6){
                break;
            }else{
                System.out.println("n ke-"+n);
            }
        }
    }
}
