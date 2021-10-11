import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

public class FunctionalQuote {
    public static void main(String[] args) {
        Consumer<String> con1 = str -> System.out.println(str);
        con1.accept("北京");
        System.out.println("===================");
        Consumer<String> con2 = System.out::println;
        con2.accept("西京");
        System.out.println("===================");

        // 情况二：类::静态方法
        // Comparator中的int compare(T t1, T t2)
        // Integer中的int compare(T t1, T t2)

        Comparator<Integer> com1 = (t1, t2) -> Integer.compare(t1, t2);
        System.out.println(com1.compare(12, 21));
        System.out.println("===================");
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(12, 21));
        System.out.println("===================");

        // Function中的R apply(T t)
        // Math中的Long round(Double d)
        Function<Double, Long> fun1 = d -> Math.round(d);
        System.out.println(fun1.apply(12.99));
        System.out.println("===================");
        Function<Double, Long> fun2 = Math::round;
        System.out.println(fun2.apply(12.99));
        System.out.println("===================");

        // 情况3：类::实例方法(难)
        // Comparator中的int compare(T t1, T t2)
        // String中的int t1.compareTo(t2)
        Comparator<String> com11 = (s1, s2) -> s1.compareTo(s2);
        System.out.println(com11.compare("abc", "abd"));
        System.out.println("===================");
        Comparator<String> com12 = String::compareTo;
        System.out.println(com12.compare("abc", "abd"));

        // BiPredicate中的boolean test(T t1, T t2)
        // String中的boolean t1.equals(t2)
        BiPredicate<String, String> pre1 = (s1, s2) -> s1.equals(s2);
        System.out.println(pre1.test("abc", "abc"));
        System.out.println("BiPredicate===================");
        BiPredicate<String, String> pre2 = String::equals;
        System.out.println(pre2.test("abc", "abc"));
        System.out.println("===================");

        // 构造器引用
        // Supplier中的T get()
        Supplier<Employee> sup1 = () -> new Employee();
        System.out.println(sup1.get());
        System.out.println("===================");
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());
        System.out.println("===================");

        // Function(T, R)
        Function<Long, Employee> fun11 = id -> new Employee(id);
        System.out.println(fun11.apply(1l));
        System.out.println("===================");
        Function<Long, Employee> fun12 = Employee::new;
        System.out.println(fun12.apply(2l));
        System.out.println("===================");

        // BiFunction中的R apply(T t, U u)
        BiFunction<Long, String, Employee> fun21 = (id, name) -> new Employee(id, name);
        System.out.println(fun21.apply(1l, "chl"));
        System.out.println("===================");
        BiFunction<Long, String, Employee> fun22 = Employee::new;
        System.out.println(fun22.apply(1l, "chl"));
        System.out.println("===================");

        // 数组引用
        // Function中的R apply(T t)
        Function<Integer, String[]> fun31 = length -> new String[length];
        String[] arr1 = fun31.apply(5);
        System.out.println(Arrays.toString(arr1));
        System.out.println("===================");
        Function<Integer, String[]> fun32 = String[]::new;
        String[] arr2 = fun32.apply(5);
        System.out.println(Arrays.toString(arr2));
        System.out.println("===================");
    }
}
