// MINIFICATION_THRESHOLD: 504
package foo

fun apply(f: (Int) -> Int, t: Int): Int {
    return f(t)
}


fun box(): String {
    return if (apply({ a: Int -> a + 5 }, 3) == 8) return "OK" else "fail"
}