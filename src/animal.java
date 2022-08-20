public  abstract class animal {

    private String tipo;
    private String nombre;


    public animal(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void nacer (){
        System.out.println("nacimiento del animal");
    }

    public abstract void comer();
    public abstract void respirar();


    }


