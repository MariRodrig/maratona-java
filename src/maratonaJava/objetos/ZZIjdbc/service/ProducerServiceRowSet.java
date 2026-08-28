package maratonaJava.objetos.ZZIjdbc.service;

import maratonaJava.objetos.ZZIjdbc.dominio.Producer;
import maratonaJava.objetos.ZZIjdbc.repository.ProducerRepository;
import maratonaJava.objetos.ZZIjdbc.repository.ProducerRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateJdbcRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateJdbcRowSet(producer);
    }

    public static void updateCachedRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}
