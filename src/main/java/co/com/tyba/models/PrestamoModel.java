package co.com.tyba.models;

import lombok.Getter;

import java.util.List;

@Getter
public class PrestamoModel {

    private final String ingresoMensual;
    private final String valorPrestamo;
    private final String cuotaInicial;
    private final String valorInmueble;
    private final String valorCuota;
    private final String valorTasaInteres;

    public PrestamoModel(List<String> datos) {
        this.ingresoMensual = datos.get(0);
        this.valorPrestamo = datos.get(1);
        this.cuotaInicial = datos.get(2);
        this.valorInmueble = datos.get(3);
        this.valorCuota = datos.get(4);
        this.valorTasaInteres = datos.get(5);
    }
}
