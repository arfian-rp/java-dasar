public class KonversiTipeData {
    //Widening Casting(Otomatis):byte->short->int->long->float->double
    //Narrowing Casting(Manual):double->float->long->int->char->short->byte
    public static void main(String[] args) {
        //WideningCasting
        byte inibyte = 10;
        short iniShort = inibyte;
        //dst

        //WideningCasting
        long iniLong = 1_000_000_000;
        int iniInt = (int) iniLong;
        //dst

        System.out.println(iniInt);
    }

}
