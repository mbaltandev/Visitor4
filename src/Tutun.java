public class Tutun extends Urun  {


    public Tutun(int fiyat, String ad) {
        super(fiyat, ad);
    }

    @Override
    public double kabul(Visitor visitor) {
        return visitor.visit(this);
    }
}
