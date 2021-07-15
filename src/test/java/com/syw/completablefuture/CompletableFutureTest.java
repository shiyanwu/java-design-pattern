package com.syw.completablefuture;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-07-15 13:41
 * @since JDK 1.8
 */
public class CompletableFutureTest {

    /**
     * 测试CompletableFuture allOf
     */
    @Test
    public void testAllOf() {
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<List<Integer>> allList = Lists.partition(list, 2);

        List<CompletableFuture<Pair<List<Integer>, Integer>>> countFutures = allList.stream().map(subList -> submit(subList, 2))
                .collect(Collectors.toList());

        CompletableFuture<Void> allFutures = CompletableFuture
                .allOf(countFutures.toArray(new CompletableFuture[0]));

        CompletableFuture<List<Pair<List<Integer>, Integer>>> listCompletableFuture = allFutures.thenApply(
                v -> countFutures.stream().map(CompletableFuture::join).collect(Collectors.toList()));
        try {
            List<Pair<List<Integer>, Integer>> result = listCompletableFuture.get();

            List<Integer> collects = result.stream().flatMap(t -> t.getLeft().stream())
                    .collect(Collectors.toList());

            collects.forEach(System.out::println);
            int sum = result.stream().flatMapToInt(t -> IntStream.of(t.getRight())).sum();
            System.out.println(sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    CompletableFuture<Pair<List<Integer>, Integer>> submit(List<Integer> subList, int XValue) {
        return CompletableFuture.supplyAsync(() -> {
            int sumInteger = 0;
            List<Integer> resultList = new ArrayList<>();
            for (int i : subList) {
                int newValue = i * XValue;
                sumInteger += newValue;
                resultList.add(newValue);
            }
            return Pair.of(resultList, sumInteger);
        });
    }
}
