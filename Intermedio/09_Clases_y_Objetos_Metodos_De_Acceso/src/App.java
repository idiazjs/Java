class Pelicula {
    public static void main(String[] args) throws Exception {
        Pelicula pelicula1 = new Pelicula("Gandhi", "Richard Attenborough", tipoGenero.DRAMA, 191, 1982, 8.1);
        Pelicula pelicula2 = new Pelicula("Thor", "Kenneth Branagh", tipoGenero.ACCION, 115, 2011, 7.0);
        System.out.println("Pelicula 1");
        pelicula1.imprime();
        System.out.println("Pelicula 2");
        pelicula2.imprime();
        System.out.println("La pelicula " + pelicula1.getNombre() + " espica: " + pelicula1.esPeliculaEpica());
        System.out.println("La pelicula " + pelicula2.getNombre() + " espica: " + pelicula2.esPeliculaEpica());
        System.out.println("La pelicula " + pelicula1.getNombre() + " y " + pelicula2.getNombre() + " son similares: "
                + pelicula1.esSimilar(pelicula2));
    }

    private String nombre;
    private String director;

    private enum tipoGenero {
        ACCION, COMEDIA, DRAMA, SUSPENSO
    }

    private tipoGenero genero;
    private int duracion;
    private int year;
    private double calificacion;

    public Pelicula(String nombre, String director, tipoGenero genero, int duracion, int year, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.year = year;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getdirector() {
        return this.director;
    }

    private void setdirector(String director) {
        this.director = director;
    }

    public tipoGenero getGenero() {
        return this.genero;
    }

    private void setGenero(tipoGenero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return this.duracion;
    }

    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public double getCalificacion() {
        return this.calificacion;
    }

    private void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void imprime() {
        System.out.println(nombre);
        System.out.println(director);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(year);
        System.out.println(calificacion);
    }

    protected boolean esPeliculaEpica() {
        if (duracion >= 180)
            return true;
        else
            return false;
    }

    private String calcularValoracion() {
        if (calificacion >= 0 && calificacion <= 2) {
            return "Muy mala";
        } else if (calificacion > 2 && calificacion <= 5) {
            return "Mala";
        } else if (calificacion > 5 && calificacion <= 7) {
            return "Regular";
        } else if (calificacion > 7 && calificacion <= 8) {
            return "Buena";
        } else
            return "Excelente";
    }

    private boolean esSimilar(Pelicula pelicula) {
        if (pelicula.genero == genero && pelicula.calcularValoracion() == calcularValoracion()) {
            return true;
        } else
            return false;
    }
}
