package homework2

import HomeWork2Java2Kotlin

class HomeWork2J2KKotlin {

    fun processString(str: String?): String {
        return str?.takeIf { it.length > 10 }
            ?.let { "value is$it" }
            ?: "default value"
    }

    fun joinListStr(arr: List<String>): String {
        return arr.flatMap { it -> it.toList() }
            .joinToString(";") { it -> "value is $it" }
    }

    fun groupString(arr: List<String>):Collection<List<String>>{
        return arr.filter { it.length > 10 }.groupBy { it.substring(0,5) }.values
    }
}

object Main {
    val java = HomeWork2Java2Kotlin()
    val kotlin = HomeWork2J2KKotlin()

    @JvmStatic
    fun main(args: Array<String>) {

        val a = String()
        val b = ""
        val c = "42"
        val d = "i have an elephant"

        val j2kNull = java.processString(a).equals(kotlin.processString(a))
        val j2kEmpty = java.processString(b).equals(kotlin.processString(b))
        val j2kShort = java.processString(c).equals(kotlin.processString(c))
        val j2kLong = java.processString(d).equals(kotlin.processString(d))

        println("$j2kNull, $j2kEmpty, $j2kShort, $j2kLong")

        val listString = listOf("lala", "haha", "dondon")
        val listStringEmpty = emptyList<String>()
        val listStringEmptyString = listOf("")

        val j2kListString = java.joinListStr(listString).equals(kotlin.joinListStr(listString))
        val j2kListStringEmpty = java.joinListStr(listStringEmpty).equals(kotlin.joinListStr(listStringEmpty))
        val j2kListStringEmptyString = java.joinListStr(listStringEmptyString).equals(kotlin.joinListStr(listStringEmptyString))
        println("$j2kListString, $j2kListStringEmpty, $j2kListStringEmptyString")

        val listStringForGroup = listOf(
            "lala",
            "lalayayayayaya",
            "lalayahahahaha",
            "balayayayayaya",
            "balayahahahaha",
            "haha",
            "dondon"
        )
        val groupedByJava = java.groupString(listStringForGroup)
        val groupedByKotlin = kotlin.groupString(listStringForGroup)

        println(groupedByJava==groupedByKotlin)

    }
}