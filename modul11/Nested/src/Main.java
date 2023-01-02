public class Main {
    public static void main(String[] args) {
        NestedClass n = new NestedClass();
        NestedClass.StaticNestedClass sn = new NestedClass.StaticNestedClass();
        n.printNama();
        sn.printNama2();
        NestedClass.InnerClass ic = n.new InnerClass();
        ic.tampilkanJurusan();
    }
}