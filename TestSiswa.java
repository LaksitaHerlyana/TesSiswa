//Drive Class

import java.util.Scanner;

public class TestSiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = in.nextLine();
        System.out.print("ID: ");
        int id = in.nextInt();
        System.out.print("IPK: ");
        double ipk = in.nextDouble();

       
       siswa ari = new siswa(id, nama, ipk);

       if (ari.getIpk() >= 75) {
        System.out.println(ari.getNama
        () + "Lulus");
       } else {
        System.out.println(ari.getNama() + "Tidak lulus");
       }

       //nilai huruf
       if (ari.getIpk() <60){
        System.out.println("E");
      }else if (ari.getIpk() > 60 && ari.getipk() <=70 ){
        System.out.println("D");
      }else if (ari.getIpk() >70 && ari.getIpk() <=80){
        System.out.println("C");
      }else if (ari.getIpk () >80 && ari.getIpk() <=90){
        System.out.println("B");
      }else if(ari.getIpk() >90 && ari.getIpk() <=100){
        System.out.println("A");
      }

       in.close();
    }
}