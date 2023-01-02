public class OuterDemoMain {
    public static void main(String[] args) {
        OuterDemo2 outer = new OuterDemo2();
        OuterDemo2.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getnum());
    }
}
