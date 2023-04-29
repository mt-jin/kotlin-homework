class HomeWork1Summary {

    fun summary(obj: Any?) =
        obj?.takeIf { it is List<*> }
            ?.let { it as List<*> }
            ?.takeUnless { it.size > 10 }
            ?.map { "list value $it" }
            ?.let { ArrayList(it) }
            ?.apply { this[0]="change value" }
            ?.also { println("got a list, size is ${it.size}, and changed the first value") }
            ?:throw Exception("obj is not a list, can not process")


}
object Main {
    val homeWork1Summary = HomeWork1Summary()
    @JvmStatic
    fun main(args: Array<String>) {
        val objLong = listOf<String>("a","b","c","d","e","a","b","c","d","e","a","b","c","d","e")
        val obj = listOf<String>("a","b","c")
        val objEmpty = listOf<String>()

//        homeWork1Summary.summary(obj)

        val summaryJava = HomeWorkSummaryJava1()
        summaryJava.summary(objEmpty)

    }
}