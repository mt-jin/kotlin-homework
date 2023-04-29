import java.util.ArrayList;

public class HomeWorkJava1 {
    /*
        fun nullCheck(obj: Any?): String =
        obj?.toString() ?: ""
    */
    public String nullCheck(Object obj) {
        if (obj != null) {
            return obj.toString();
        } else {
            return "";
        }
    }

    /*
        fun objLet(obj: Any): String =
                obj.let { obj.toString() }
    */
    public String objLet(Object object) {
        return object.toString();
    }

    /*
        fun objApply(obj: Array<String>) {
            obj.apply { this[0] = "element" }
        }
    */
    public void objApply(ArrayList<String> array) {
        array.set(0, "element");
    }

    /*
        fun objTakeIf(obj: String): String? {
            return obj.takeIf { "i" in it }
        }
    */
    public String objTakeIf(String obj) {
        if (obj.contains("i")) {
            return obj;
        } else return null;
    }


    /*
        fun objTakeUnless(obj: String): String? {
            return obj.takeUnless { "i" in it }
        }
    */
    public String objTakeUnless(String obj) {
        if (obj.contains("i")) {
            return null;
        } else return obj;
    }

    /*
        fun objWith(obj: String): String {
            return with(obj) {
                "value is $this"
            }
        }
    */
    public String objWith(String obj) {
        return "value is " + obj;
    }
/*
    fun objAlso(obj: String): String {
        return obj.also { println("value is $it") }
    }
*/

    public String objAlso(String obj) {
        System.out.println("value is " + obj);
        return obj;
    }

    /*
        fun repeatFun() {
            repeat(3) { println("value is $it") }
        }
    */
    public void repeatFun() {
        for (int i = 0; i < 3; i++) {
            System.out.println("value is " + i);
        }
    }
}
