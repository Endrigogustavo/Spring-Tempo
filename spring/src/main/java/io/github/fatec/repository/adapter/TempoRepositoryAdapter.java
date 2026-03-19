package io.github.fatec.repository.adapter;

import io.github.fatec.entity.Tempo;
import io.github.fatec.repository.orm.TempoOrmMongo;

public class TempoRepositoryAdapter {
    private TempoRepositoryAdapter() {
    }

    public static Tempo castOrm(TempoOrmMongo orm) {
        return new Tempo(
                orm.tempoZona(),
                orm.dataHora(),
                orm.temperaturaDia(),
                orm.unidadeTemperaturaDia(),
                orm.vento(),
                orm.unidadeVento());
    }

    public static TempoOrmMongo castEntity(Tempo entity) {
        return new TempoOrmMongo(
                entity.tempoZona(),
                entity.dataHora(),
                entity.temperaturaDia(),
                entity.unidadeTemperaturaDia(),
                entity.vento(),
                entity.unidadeVento());
    }
}
