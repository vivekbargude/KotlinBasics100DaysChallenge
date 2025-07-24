package Variables_DataTypes// Variables.kt

// Function to demonstrate variable declaration and usage
fun basicVariables() {
    println("\n--- Kotlin Variables and Data Types ---")

    // =============================
    // val vs var
    // =============================

    // val: Immutable (read-only) variable. Cannot be reassigned after initialization.
    val name: String = "Alice"  // Explicit type declaration
    // name = "Bob" // ❌ Error: Val cannot be reassigned

    // var: Mutable variable. Can be changed later.
    var age: Int = 25
    println("Name: $name, Age: $age")

    // Reassigning mutable variable
    age = 26
    println("Updated Age: $age")

    // =============================
    // Kotlin Basic Data Types
    // =============================

    // Integer types
    val intVal: Int = 100
    val longVal: Long = 10000000000L
    val shortVal: Short = 10
    val byteVal: Byte = 1

    // Floating-point types
    val floatVal: Float = 3.14f
    val doubleVal: Double = 3.1415926535

    // Character
    val charVal: Char = 'K'

    // Boolean
    val isKotlinFun: Boolean = true

    // String (already used above)
    val message: String = "Learning Kotlin is fun!"

    println("Int: $intVal, Long: $longVal, Short: $shortVal, Byte: $byteVal")
    println("Float: $floatVal, Double: $doubleVal")
    println("Char: $charVal, Boolean: $isKotlinFun")
    println("String: $message")

    // =============================
    // Type Inference (No need to specify type explicitly)
    // =============================

    val city = "Pune"      // Kotlin infers this is String
    var score = 98.5       // Kotlin infers this is Double
    println("City: $city, Score: $score")
}
