package NullSafety

fun nullSafetyDemo() {
    println("\n--- Null Safety in Kotlin ---")

    // Non-nullable variable (default)
    val normalString: String = "Hello"
    println("Non-nullable: $normalString")

    // Nullable variable
    val nullableString: String? = null

    // Safe call operator (?.)
    println("Length (safe call): ${nullableString?.length}")

    // Elvis operator (?:) for default fallback
    val length = nullableString?.length ?: 0
    println("Length (with default): $length")

    // Not-null assertion (!!) — risky, avoid unless you're sure
    // println(nullableString!!.length) // This will crash if null
}
