// MINIFICATION_THRESHOLD: 514
package foo

fun box(): String {
    assertEquals("bar.boo(23)", bar.boo(23))
    assertEquals("bar.boo(Hello)", bar.boo("Hello"))
    assertEquals("bar.boo(object t {})", bar.boo(t))
    assertEquals("bar.boo(null)", bar.boo(null))

    return "OK"
}