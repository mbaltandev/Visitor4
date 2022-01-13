import java.text.DecimalFormat;

public class VergiVisitor implements Visitor {


    public VergiVisitor( ) {

    }

    @Override
    public double visit(Alkol alkol) {
        System.out.print(alkol.getAd()+" ");
        return alkol.getFiyat()*2;
    }

    @Override
    public double visit(Tutun tutun) {
        System.out.print(tutun.getAd()+" ");
        return tutun.getFiyat()*2;
    }

    @Override
    public double visit(Ekmek ekmek) {
        System.out.print(ekmek.getAd()+" ");
        return ekmek.getFiyat()*2;
    }
}
