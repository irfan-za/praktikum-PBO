package latihan;

public class Main {
    public static void main(String[] args) {

        Manager m= new Manager();
        m.setNama("Muhammad");
        m.setGaji(90000);
        m.setUsia(20);
        m.setJamKerja(8.5f);


        System.out.println(m.getNama()+"\n"+
                m.getGaji()+"\n"+
                m.getUsia()+"\n"+
                m.jamKerja()+"\n"+"==========="
    );
        Manager m1= new Manager();
        m1.setNama("Irfan");
        m1.setGaji(100000);
        m1.setUsia(22);
        m1.setJamKerja(8.5f);


        System.out.println(m1.getNama()+"\n"+
                m1.getGaji()+"\n"+
                m1.getUsia()+"\n"+
                m1.jamKerja()+"\n"+"==========="
    );
        Manager m2= new Manager();
        m2.setNama("Zahran");
        m2.setGaji(86000);
        m2.setUsia(27);
        m2.setJamKerja(8.5f);


        System.out.println(m2.getNama()+"\n"+
                m2.getGaji()+"\n"+
                m2.getUsia()+"\n"+
                m2.jamKerja()+"\n"+"==========="
    );
        Manager m3= new Manager();
        m3.setNama("Muhammad Irfan Zahran");
        m3.setGaji(65000);
        m3.setUsia(21);
        m3.setJamKerja(8.5f);


        System.out.println(m3.getNama()+"\n"+
                m3.getGaji()+"\n"+
                m3.getUsia()+"\n"+
                m3.jamKerja()+"\n"+"==========="
    );
        Manager m4= new Manager();
        m4.setNama("Muhammad Irfan");
        m4.setGaji(68000);
        m4.setUsia(25);
        m4.setJamKerja(8.5f);


        System.out.println(m4.getNama()+"\n"+
                m4.getGaji()+"\n"+
                m4.getUsia()+"\n"+
                m4.jamKerja()+"\n"+"==========="
    );

    }
}
