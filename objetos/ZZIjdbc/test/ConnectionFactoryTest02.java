package maratonaJava.objetos.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonaJava.objetos.ZZIjdbc.dominio.Producer;
import maratonaJava.objetos.ZZIjdbc.service.ProducerServiceRowSet;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer produceToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        ProducerServiceRowSet.updateCachedRowSet(produceToUpdate);
//        log.info("---------------");
//        List<Producer> producers = ProducerRepositoryRowSet.findByNameJdbcRowSet("");
//        log.info(producers);
    }
}
