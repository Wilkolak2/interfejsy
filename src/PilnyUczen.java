public class PilnyUczen implements Uczen, Comparable<PilnyUczen> {

    private int punktyNauki = 0;
    @Override
    public void uczSie() {
        System.out.println("Uczę się pilnie");
        punktyNauki++;
    }

    @Override
    public void spij() {
        System.out.println("Sen jest dla słabych");
    }

    public void bierzUdzialwSzybkiej20(){
        System.out.println("Muszę mieć synik 20/20");
    }

    @Override
    public int compareTo(PilnyUczen o) {
        return punktyNauki - o.punktyNauki;
    }
}
