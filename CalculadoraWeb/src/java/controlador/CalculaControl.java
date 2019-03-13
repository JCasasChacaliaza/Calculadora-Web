package controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import servicio.CalculadoraService;

@Named(value = "calculaControl")
@SessionScoped
public class CalculaControl implements Serializable {

    int nro1, nro2;
    String result = "";
    char operador;

    public void calcular() {
        result = CalculadoraService.respuesta(nro1, nro2, operador);
    }
    
    
    public void limpiar(){
        setNro1(10);
        setNro2(10);
        setResult("");
        setOperador('0');
    }

    public int getNro1() {
        return nro1;
    }

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public CalculaControl() {
    }

}
