// MINIFICATION_THRESHOLD: 513
package foo

abstract class A(val s: String) {
}

object B : A("test") {
}

fun box() = if (B.s == "test") "OK" else "fail: ${B.s}"
