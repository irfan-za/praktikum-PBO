package praktikum5;

public class ConstructorAccess {
    public static void main(String[] args) {


        System.out.println("Latihan 1👇");
        Constructor c= new Constructor();

        System.out.println("\nLatihan 2👇");
        ParamConstructor pc= new ParamConstructor("Muhammad","Belajar Python");
        ParamConstructor pc0= new ParamConstructor(2022,30);
        ParamConstructor pc1= new ParamConstructor(50000);
        pc.jp();
        pc0.tc();
        pc1.harga();
        System.out.println("\n===");
        ParamConstructor pc2= new ParamConstructor("Irfan","Belajar Membaca");
        ParamConstructor pc3= new ParamConstructor(2022,98);
        ParamConstructor pc4= new ParamConstructor(300000);
        pc2.jp();
        pc3.tc();
        pc4.harga();
        System.out.println("\n===");
        ParamConstructor pc5= new ParamConstructor("Zahran","Belajar Java");
        ParamConstructor pc6= new ParamConstructor(2022,24);
        ParamConstructor pc7= new ParamConstructor(800000);
        pc5.jp();
        pc6.tc();
        pc7.harga();
        System.out.println("\n===");
        ParamConstructor pc8= new ParamConstructor("Zahran","Belajar Java");
        ParamConstructor pc9= new ParamConstructor(2022,1);
        ParamConstructor pc10= new ParamConstructor(9000000);
        pc8.jp();
        pc9.tc();
        pc10.harga();
        System.out.println("\n===");


        System.out.println("\n\nTugas👇");
        DefaultParamConstructor def= new DefaultParamConstructor();
        DefaultParamConstructor param= new DefaultParamConstructor("Irfan",20);
        param.sapa();

    }
}

