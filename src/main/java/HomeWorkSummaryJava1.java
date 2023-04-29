import java.util.ArrayList;
import java.util.List;

public class HomeWorkSummaryJava1 {
    public Object summary(Object object) throws Exception {
        if (object == null) throw new Exception("obj is not a list, can not process");
        if (object instanceof List<?>) {
            List<?> list = (List<?>) object;
            if (((List<?>) object).size() > 10) {
                throw new Exception("obj is not a list, can not process");
            } else {
                if (((List<?>) object).size() < 1) {
                    throw new Exception("The List is empty");
                } else {
                    List<String> listString = new ArrayList<String>();
                    list.forEach(it -> {
                        listString.add("list value $it");
                    });
                    listString.set(0,"change value");
                    System.out.println("got a list, size is " + listString.size() +" , and changed the first value");
                    return listString;
                }
            }
        } else {
            throw new Exception("obj is not a list, can not process");
        }
    }
}
