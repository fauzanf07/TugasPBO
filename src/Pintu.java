import java.util.ArrayList;

public class Pintu extends Objek{

  public Pintu() {
        //init pilihan
        this.nama = "Pintu";
        arrAksi.add("Deskripsikan "+nama);
        arrAksi.add("Coba buka "+nama);
  }
  
  @Override
  public void prosesAksi(int subPil) {
        //1: deskripsikan
        //2: buka pintu
        if (subPil==1) {
            System.out.println(nama+" berwarna merah dengan tulisan 'EXIT' di atas ");
        } else if (subPil==2) {
            //cek apakah mempunyai kunci
            if (objGameInfo.getObjPlayer().cariItem("Kunci")) {
                //kunci ada, pintu terbuka
                System.out.println("Player menggunakan kunci untuk membuka "+nama+" dan "+nama+" terbuka!");
                objGameInfo.setGameOver(true); //game over
            } else {
                //kunci tidak ada
                System.out.println("Player mencboa membuka "+nama+". TERKUNCI!");
            }
        }
    }
}