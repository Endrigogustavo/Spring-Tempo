package io.github.fatec.repository.orm;

import java.util.Date;

public class TempoOrmMongo {
    private String tempoZona;
    private Date dataHora;
    private Double temperaturaDia;
    private String unidadeTemperaturaDia;
    private Double vento;
    private String unidadeVento;

    public TempoOrmMongo() {}

    public TempoOrmMongo(String tempoZona, Date dataHora, Double temperaturaDia, String unidadeTemperaturaDia, Double vento, String unidadeVento) {
        this.tempoZona = tempoZona;
        this.dataHora = dataHora;
        this.temperaturaDia = temperaturaDia;
        this.unidadeTemperaturaDia = unidadeTemperaturaDia;
        this.vento = vento;
        this.unidadeVento = unidadeVento;
    }

    public String tempoZona() { return tempoZona; }
    public Date dataHora() { return dataHora; }
    public Double temperaturaDia() { return temperaturaDia; }
    public String unidadeTemperaturaDia() { return unidadeTemperaturaDia; }
    public Double vento() { return vento; }
    public String unidadeVento() { return unidadeVento; }
}