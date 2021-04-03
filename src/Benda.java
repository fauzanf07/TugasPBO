import java.util.ArrayList;
//belum menggunakan inheritance, idealnya turunan dari Item

public class Benda {

    protected String nama;
    protected ArrayList<String> arrAksi = new ArrayList<>();
    protected GameInfo objGameInfo;

    //constrcutor
    public Benda(String benda) {
        //init pilihan
        this.nama = benda;
        arrAksi.add("Deskripsikan "+benda);
        arrAksi.add("Coba buka "+benda);
    }

    public Benda(){
        
    }
    
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

    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
    }

    public ArrayList<String> getAksi() {
        return arrAksi;
    }

}
