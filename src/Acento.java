import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acento {

    public void acentos(String RegularExpresion, String archivo) throws Exception{
        Pattern patron = Pattern.compile(RegularExpresion,Pattern.MULTILINE);
        LeerArchivo leer = new LeerArchivo();

        for (String[] lineas: leer.lineas(archivo)) {
            Matcher matcher = patron.matcher(lineas[1]);
            if (matcher.find()) {
                System.out.println("Linea: " + lineas[0] + "\tSI" + "\tAcento encontrado -- Corresponde a la Expresión Regular...");
            }else{
                System.out.println("Linea: " + lineas[0] + "\tNO");
            }
        }
    }
}
