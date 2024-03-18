public class KiepskiUczen implements Uczen, Comparable<KiepskiUczen>{
    private int punktySnu = 0;
    @Override
    public void uczSie() {
        System.out.println("Nauka jest da słabych");
    }

    @Override
    public void spij() {
        System.out.println("Śpię cały czas");
        punktySnu++;
    }

    public void graj(){
        System.out.println("Gram w grę");
    }

    @Override
    public int compareTo(KiepskiUczen o) {
        return punktySnu - o.punktySnu;
    }
}
