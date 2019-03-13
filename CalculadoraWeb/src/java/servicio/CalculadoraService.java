
package servicio;

public class CalculadoraService {
    public static String respuesta(int nro1, int nro2, char ope) {
        String result="";
        switch (ope) {
            case '0':
                result = "Selecciona un operador";
                break;
            case '+':
                result = String.valueOf(nro1 + nro2);
                break;
            case '-':
                result = String.valueOf(nro1 - nro2);
                break;
            case '*':
                result = String.valueOf(nro1 * nro2);
                break;
            case '/':
                result = String.valueOf(nro1 / nro2);
                break;
        }
        return result;
    }

}
