public class OuterDemo2 {
    private int num = 175;
    public class Inner_Demo{
        public int getnum(){
            System.out.println("Ini adalah nilai dari variable private outerDemo");
            return num;
        }
    }
}
