public class main {
    public static void main(String[] args) {

   perro p= new perro("mamifero","perro",5,"paco","buldog");
        System.out.println("metodos del padre: ");
        p.nacer();
        p.respirar();
        p.comer();
        System.out.println("metodos de interfas ");
        p.bañar();
        p.vacunas();

    }


}
