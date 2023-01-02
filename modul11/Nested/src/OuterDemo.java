public class OuterDemo {
        int num;

        private class InnerDemo{
            private void print(){
                System.out.println("Ini Merupakan method inner class");
            }
        }
        void displayInner() {
            InnerDemo inner = new InnerDemo();
            inner.print();
        }
}
