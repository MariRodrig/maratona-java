package maratonaJava.objetos.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonaJava.objetos.ZZIjdbc.dominio.Producer;
import maratonaJava.objetos.ZZIjdbc.service.ProducerService;

import java.sql.SQLException;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) throws SQLException {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer produceToUpdate = Producer.builder().id(1).name("madhouse").build();
//        ProducerService.save(producer);
//        ProducerService.delete(4);
//        ProducerService.update(produceToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);
//        ProducerService.showProducerMetadata();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
//        List<Producer> producers = ProducerService.findByNameAndInsertWhenNotFound("A-1 pictures");
//        log.info("Producers found '{}'", producers);
//        ProducerService.findByNameAndDelete("A-1 pictures");
//        List<Producer> producers = ProducerService.findByNamePreparedStatement("Bones");
//        log.info("Producers found '{}'", producers);
//        ProducerService.updatePreparedStatement(produceToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("NHK");
        log.info("Producers found '{}'", producers);

    }
}
