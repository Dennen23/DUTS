
package Clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class deposito {
    private String usuario;
    private String tipo;
    private double monto;
    private String fecha;

    public deposito(String fecha, String usuario, String tipo, double monto){
        this.fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        this.tipo = tipo;
        this.monto = monto;
        this.usuario = usuario;
    }
    
    public String toCSV(){
        return getFecha() +"," + usuario +"," + tipo +"," + monto;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public deposito() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
