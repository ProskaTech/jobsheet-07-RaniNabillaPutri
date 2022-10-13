//created by 21343034_Rani Nabilla Putri

public class Job7Lat9_NestedLoop {
    public static void main(String []args){
        int baris, kolom, hasil_kali;
        int MAKS = 8;

        for (baris = 1; baris <= MAKS; baris++)
        {
            for (kolom = 1; kolom <= MAKS; kolom++)
            {
                hasil_kali = baris * kolom;
                System.out.print("\t" + hasil_kali);
            }
            System.out.println("");
        }
    }
}
