import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Tester {
    public static void main(String[] args) {
//        forEach();
//        map();
//        filter();
//        limit();
//        sorted();//升序
        sorted1();//降序
    }

    /**
     * 降序
     */
    private static void sorted1() {

        Random random = new Random();
//        random.ints().limit(10).sorted().reversed().forEach(System.out::println);
        // 1.新建List对象
        List<Integer> listInteger = Arrays.asList(
                10,20,-10,-11,-12,30,0,9,8
        );
        // 2.定制排序接口
        Comparator<Integer> com = (a,b) -> b.compareTo(a);

        /**
         * Stream<T> sorted(Comparator<? super T> comparator)：
         * 返回由该流的元素组成的流，根据提供的Comparator进行排序。
         * 对于有序流，排序稳定。 对于无序的流，不能保证稳定性。
         * 这是一个stateful intermediate operation 。
         * 参数
         *  comparator -一个 non-interfering ， stateless Comparator被用于比较流元素
         * 结果
         *  新的流
         */
        // 3.获取Stream，并进行排序(Comparator传进去)
        Stream<Integer> sorted = listInteger.stream().sorted(com);

        // 4.打印排序过后的新流
        sorted.forEach(System.out::println);
    }

    /**
     * sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
     */
    private static void sorted() {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }

    /**
     * limit 方法用于获取指定数量的流。以下代码片段使用 limit 方法打印出 10 条数据：
     */
    private static void limit() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    private static void filter() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
// 获取空字符串的数量
        int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
    }

    /**
     * map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数：
     */
    private static void map() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        squaresList.stream().forEach(System.out::println);
    }


    /**
     * Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用forEach 输出了10个随机数：
     */
    public static void forEach() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }


}
