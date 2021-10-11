import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("学习太累了，去天上人间买了瓶矿泉水，价格为：" + aDouble);
            }
        });

        System.out.println("***********************");

        happyTime(400, aDouble -> System.out.println("学习太累了，去天上人间买了瓶矿泉水，价格为：" + aDouble));

        List<String> strings = Arrays.asList("北京", "南京", "青岛", "太原", "东京", "西京", "普京");
        List<String> list = filterString(strings, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(list);
        System.out.println("================================");
        List<String> list1 = filterString(strings, s -> s.contains("京"));
        System.out.println(list1);
    }


    public static void happyTime(double money, Consumer<Double> con){
        con.accept(money);
    }

    public static List<String>  filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> filterList = new ArrayList<>();
        for (String s : list) {
            if(pre.test(s)){
                filterList.add(s);
            }
        }

        return filterList;
    }
}
