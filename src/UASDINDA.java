import java.util.ArrayList;

public class UASDINDA {
    public static void main(String[] args) {
        ArrayList<Integer> produkbiru = new ArrayList<>();
        ArrayList<Integer> produksimerah = new ArrayList<>();
        ArrayList<Integer> produksihijau = new ArrayList<>();
        ArrayList<Integer> produksioranye = new ArrayList<>();
        ArrayList<Integer> produksihitam = new ArrayList<>();
        ArrayList<Integer> prouksiungu = new ArrayList<>();
        int totalproduksi = 20000;
        for (int i = 0; i < totalproduksi; i++) {
            int randomWarna = (int) (Math.random() * 6);
            switch (randomWarna) {
                case 0:
                    produkbiru.add(i);
                    break;
                case 1:
                    produksimerah.add(i);
                    break;
                case 2:
                    produksihijau.add(i);
                    break;
                case 3:
                    produksioranye.add(i);
                    break;
                case 4:
                    produksihitam.add(i);
                    break;
                case 5:
                    prouksiungu.add(i);
                    break;
            }
        }
        System.out.println("produksi biru: " + produkbiru);
        System.out.println("produksi merah " + produksihijau);
        System.out.println("prouksi hijau " + produksihijau);
        System.out.println("produksi oranye " + produksioranye);
        System.out.println("produksi hitam " + produksihitam);
        System.out.println("produksi ungu " + prouksiungu);
    }
}
