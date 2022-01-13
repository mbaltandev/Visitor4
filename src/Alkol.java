public class Alkol extends Urun    {


    public Alkol(int fiyat, String ad) {
        super(fiyat, ad);
    }


    @Override
    public double kabul(Visitor visitor) {
        return visitor.visit(this);
    }
}
