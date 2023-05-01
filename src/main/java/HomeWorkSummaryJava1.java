import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HomeWorkSummaryJava1 {
    public void summary(Object object) throws Exception {
        try {
            ArrayList<String> arrayList = Optional.of(object)
                    .filter(it -> it instanceof List<?>)
                    .map(it -> (List<?>) it)
                    .filter(it -> it.size() <= 10)
                    .map(it -> "list value $it")
                    .stream()
                    .collect(Collectors.toCollection(ArrayList::new));
            arrayList.set(0, "change value");
            System.out.println("got a list, size is " + arrayList.size() + " , and changed the first value");
        } catch (NullPointerException e) {
            throw new Exception("obj is not a list, can not process");
        }
    }
}
