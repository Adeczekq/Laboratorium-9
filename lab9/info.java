import java.util.Objects;

class  info{
    int ID,wiek;
    String imie;

    public int getID() {
        return ID;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public info(int ID, int wiek, String imie) {
        this.ID = ID;
        this.wiek = wiek;
        this.imie = imie;
    }

    @Override
    public String toString(){
        return ("ID uczestnika: "+ID+"\nWiek: "+wiek+"\nImie: "+imie);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        info infoUcz = (info) o;
        return ID == infoUcz.ID && wiek == infoUcz.wiek && Objects.equals(imie, infoUcz.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }
}