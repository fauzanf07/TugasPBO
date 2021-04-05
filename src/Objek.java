import java.util.ArrayList;
// class parent untuk Item, NPC, dan pintu

public class Objek {

    protected String nama;
    protected ArrayList<String> arrAksi = new ArrayList<>();
    protected GameInfo objGameInfo;

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

    public void prosesAksi(int subPil) {
        }
}
