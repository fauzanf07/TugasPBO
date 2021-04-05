import java.util.ArrayList;
// class parent untuk Item, NPC, dan pintu

public class Objek {

    private String nama;
    private ArrayList<String> arrAksi = new ArrayList<>();
    private GameInfo objGameInfo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
    }

    public ArrayList<String> getAksi() {
        return arrAksi;
    }

    public void setArrAksi(String vArrAksi){
      arrAksi.add(vArrAksi);
    }

    public void prosesAksi(int pilObj){

    }
    
}
