public abstract class Urun implements Ziyaret {
    protected int Fiyat;
    protected String  Ad;

    public int getFiyat() {
        return Fiyat;
    }

    public String getAd() {
        return Ad;
    }

    public Urun(int fiyat, String ad) {
        Fiyat = fiyat;
        Ad = ad;
    }


}
