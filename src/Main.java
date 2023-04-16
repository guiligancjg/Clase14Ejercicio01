
public class Main {
    public static void main(String[] args) throws Exception {
        String archivo = "archivo.txt";
        String RegularExpresionAcentos = "[áéíóúÁÉÍÓÚ]";//Busca los acentos en una linea.

        Acento buscar = new Acento();
        buscar.acentos(RegularExpresionAcentos,archivo);
    }
}