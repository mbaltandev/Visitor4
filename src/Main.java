public class Main {

    public static void main(String[] args) {
	VergiVisitor haftaici=new VergiVisitor();
    HaftasonuVergiVisitor haftasonu=new HaftasonuVergiVisitor();

    Ekmek bugdayekmek=new Ekmek(2,"bugdayekmek");
    Alkol vodka=new Alkol(120,"vodka");
    Tutun tutun=new Tutun(20,"tutun");
    Tutun tutun2=new Tutun(40,"Parliament");

        System.out.println("Hafta ici fiyatlar TL");
        System.out.println(bugdayekmek.kabul(haftaici));
        System.out.println(vodka.kabul(haftaici));
        System.out.println(tutun.kabul(haftaici));
        System.out.println(tutun2.kabul(haftaici));

        System.out.println("Hafta sonu fiyatlar TL");
        System.out.println(bugdayekmek.kabul(haftasonu));
        System.out.println(vodka.kabul(haftasonu));
        System.out.println(tutun.kabul(haftasonu));
        System.out.println(tutun2.kabul(haftasonu));
    }
}
