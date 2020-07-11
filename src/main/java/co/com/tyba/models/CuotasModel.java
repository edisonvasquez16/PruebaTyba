package co.com.tyba.models;

import lombok.Getter;

import java.util.List;

@Getter
public class CuotasModel {

    private final String valorCredito;
    private final String ingresosMensuales;
    private final String cuotaInicial;
    private final String valorInmueble;
    private final String valorCuotaMensual;
    private final String valorPrestamo;
    private final String valorTasaIntere;

    public CuotasModel(List<String> data) {
        this.valorCredito = data.get(0);
        this.ingresosMensuales = data.get(1);
        this.cuotaInicial = data.get(2);
        this.valorInmueble = data.get(3);
        this.valorCuotaMensual = data.get(4);
        this.valorPrestamo = data.get(5);
        this.valorTasaIntere = data.get(5);
    }
}
