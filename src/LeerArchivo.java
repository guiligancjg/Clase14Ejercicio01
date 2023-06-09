import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo{

    public List<String[]> lineas(String archivo) throws Exception {
        List<String[]> lista = new ArrayList<>();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();

            while (lectura != null) {
                lista.add(lectura.split(";"));
                lectura = entrada.readLine();
            }

            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo leer el Archivo...");
        }
        return lista;
    }
}
