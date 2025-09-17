package Java;
public class caja<T> {
    private T objeto;
    public void guardar(T objeto) { this.objeto = objeto; }
    public T obtener() { return objeto; }
}
