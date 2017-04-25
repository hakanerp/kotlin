// MINIFICATION_THRESHOLD: 1177
package foo

fun box(): String {
    val v = mapOf(1 to "1", 2 to "2").mapValues { it.value.map { it.toString() } }
    assertEquals(2, v.size)

    return "OK"
}