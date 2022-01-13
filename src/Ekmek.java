public class Ekmek extends Urun   {


    public Ekmek(int fiyat, String ad) {
        super(fiyat, ad);
    }

    @Override
    public double kabul(Visitor visitor) {
        return visitor.visit(this);
    }
}
