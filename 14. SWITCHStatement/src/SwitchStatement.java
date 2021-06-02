public class SwitchStatement {
    public static void main(String[] args) {
        char N = 'U';
        switch (N){
            case'A':
                System.out.println('A');
                break;
            case'b':
                System.out.println('b');
                break;
            case'C':
                System.out.println('C');
                break;
            default:
                System.out.println("default");
        }

        //switch Lamda
        switch (N){
            case 'A' -> System.out.println('A');
            case 'B' -> System.out.println('B');
            case 'C' -> System.out.println('C');
            default -> {
                System.out.println("default");
            }
        }
    }
}
