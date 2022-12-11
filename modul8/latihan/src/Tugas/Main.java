package Tugas;

public class Main {
    public static void main(String[] args) {
        Hewan h= new Hewan();
        CustomerData cd= new CustomerData();
        CustomerData cd1= new CustomerData("Zahran", "Surakarta", "2-2-1990", "Wiraswasta", 20000000);

        Bank b= new Bank();
        BankPasar bpr= new BankPasar();
        BankPribadi bpb= new BankPribadi();
        BankSyariah bs= new BankSyariah();
        BankUmum bu= new BankUmum();


        System.out.println(
                "=================================\n"+
                "BANK 👇\n" +
                "=================================\n");
        System.out.println("BANK => "+ b.rasioBunga()+"%");
        System.out.println("BANK Pasar => "+ bpr.rasioBunga()+"%");
        System.out.println("BANK Pribadi => "+ bpb.rasioBunga()+"%");
        System.out.println("BANK Syariah => "+ bs.rasioBunga()+"%");
        System.out.println("BANK Umum => "+ bu.rasioBunga()+"%");

    }
}
