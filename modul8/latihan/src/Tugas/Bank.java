package Tugas;

public class Bank {
    protected int rasioBunga(){
        return 9;
    };

}

class BankPribadi extends Bank{
    protected int rasioBunga(){
        return 11;
    };
}
class BankUmum extends Bank{
    protected int rasioBunga(){
        return 10;
    };
}
class BankPasar extends BankUmum{
    protected int rasioBunga(){
        return 12;
    };
}
class BankSyariah extends BankUmum{
    protected int rasioBunga(){
        return 15;
    };
}
