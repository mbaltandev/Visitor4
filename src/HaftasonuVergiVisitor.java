import java.text.DecimalFormat;

public class HaftasonuVergiVisitor implements Visitor {

    public HaftasonuVergiVisitor() {

    }

    @Override
    public double visit(Alkol alkol) {
        System.out.print(alkol.getAd() + " ");
        return alkol.getFiyat() * 3;
    }

    @Override
    public double visit(Tutun tutun) {
        System.out.print(tutun.getAd() + " ");
        return tutun.getFiyat() * 3;
    }

    @Override
    public double visit(Ekmek ekmek) {
        System.out.print(ekmek.getAd() + " ");
        return ekmek.getFiyat() * 3;
    }
}


