package maratonaJava.objetos.ZZGconcorrencia.test;

import maratonaJava.objetos.ZZGconcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPriceSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    public static void searchPriceSync(StoreService StoreService) {
        long start = System.currentTimeMillis();
        System.out.println(StoreService.getPriceSync("Store 1"));
        System.out.println(StoreService.getPriceSync("Store 2"));
        System.out.println(StoreService.getPriceSync("Store 3"));
        System.out.println(StoreService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end - start));
    }

    private static void searchPricesAsyncFuture(StoreService StoreService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = StoreService.getPricesAsyncFuture("Store 1");
        Future<Double> pricesAsyncFuture2 = StoreService.getPricesAsyncFuture("Store 2");
        Future<Double> pricesAsyncFuture3 = StoreService.getPricesAsyncFuture("Store 3");
        Future<Double> pricesAsyncFuture4 = StoreService.getPricesAsyncFuture("Store 4");
        try {
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
            System.out.println(pricesAsyncFuture4.get());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end - start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService StoreService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture1 = StoreService.getPricesAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> pricesAsyncFuture2 = StoreService.getPricesAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> pricesAsyncFuture3 = StoreService.getPricesAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> pricesAsyncFuture4 = StoreService.getPricesAsyncCompletableFuture("Store 4");

        System.out.println(pricesAsyncFuture1.join());
        System.out.println(pricesAsyncFuture2.join());
        System.out.println(pricesAsyncFuture3.join());
        System.out.println(pricesAsyncFuture4.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end - start));
    }
}
