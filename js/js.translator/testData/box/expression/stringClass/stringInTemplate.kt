// MINIFICATION_THRESHOLD: 507
// CHECK_NOT_CALLED_IN_SCOPE: scope=box function=toString

package foo

fun box(): String {
    var name = "Hello"
    assertEquals("oHelloo", "o${name}o")
    return "OK";
}

