public class array {
    public static void main(String[] args) {
        String [] ArrayNama = new String[2];
        ArrayNama[0] = "Arfian";
        ArrayNama[1] = "Pradana";
        System.out.println(ArrayNama[0] + ArrayNama[1]);

        int[] ArrayInt1 = new int[]{
                10,20,30
        };
        int[] ArrayInt2 = {
                20,30,40
        };

        //operasi di array
        System.out.println(ArrayInt1[0]);//mengambil data
        ArrayInt2[1] = 120; // mengubah isi index
        System.out.println(ArrayInt2.length);//mengambil panjang array

        //array dalam array
        int[][] arrayint = {
                {10,20,30},
                {4,5,6},
                {3,4,5,}
        };
        System.out.println(arrayint[0]);
        System.out.println(arrayint[0][2]);
    }
}
