public class perro extends animal implements mascotas  {

    private int edad;
    private String nombrePerro;
    private String raza;

    public perro(String tipo, String nombre, int edad, String nombrePerro, String raza) {
        super(tipo, nombre);
        this.edad = edad;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
    }

    @Override
    public void bañar() {
        System.out.println("bañando a: "+this.nombrePerro);

    }

    @Override
    public void vacunas() {
        System.out.println("vacuno a: "+this.nombrePerro);

    }
    @Override
    public void comer() {
        System.out.println("el perro come concentrado, en un plato.");

    } @Override
    public void respirar() {
        System.out.println(" el perro respira solo.");

    }
}
