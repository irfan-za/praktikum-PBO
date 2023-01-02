public class NestedClass {

        String nama = "Muhammad Irfan Zahran";
        String nim = "L200210016";
        public void printNama(){
            System.out.println("Nama : "+nama + "\nNo : " + nim);
        }
        static class StaticNestedClass{
            static String jurusan = "Teknik Informatika";
            public void printNama2(){
                NestedClass nest = new NestedClass();
                System.out.println("STATIC NESTED CLASS👇");
                nest.printNama();
            }
        }
        class InnerClass{
            public void tampilkanJurusan(){
                NestedClass.StaticNestedClass j = new NestedClass.StaticNestedClass();
                System.out.println("Jurusan :" + j.jurusan );
            }

        }

}
