/* --------------------------- MODELO ----------------------------- */


package Biblio;


public class ModeloL {
    
    private String Nombre, Editorial, Fecha_P, Autor, Categoria;
    private int Cons;
    

    public int getCons() {
        
        return Cons;
    }

    public int setCons(int a) {
        this.Cons = a;
        return 0;
    }
    
    public ModeloL(){
        
    }

    public ModeloL(String Nombre, String Editorial, String Fecha_P, String Autor, String Categoria, int Cons) {
        this.Nombre = Nombre;
        this.Editorial = Editorial;
        this.Fecha_P = Fecha_P;
        this.Autor = Autor;
        this.Categoria = Categoria;
        this.Cons = Cons;
    }
        
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getFecha_P() {
        return Fecha_P;
    }

    public void setFecha_P(String Fecha_P) {
        this.Fecha_P = Fecha_P;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int Contador(){
        Cons = Cons + 1;
        return Cons;
    }
    
    
}
