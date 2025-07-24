fun main() {
    //Primitive Data types
    val x: Double = 5.0
    val y: Int = 5
    val z: Float = 5f
    val a: Boolean = false
    val b: String = "abc"


    //Concept of Val and Var
    // Val = after initialization we can't change the value of the variable
    // Var = after initialization we can change the value of the variable
    val num1 = 5
    var num2 = 4
    num2 += 1

    //Operators
    // + - * / % ++ -- += -= *= %= /=
    // > < >= <= == !=
    // && ,||, &, | (&& has more priority)

    //Display variables
    // $ or ${}
    //print("The value of num1 is $num1")

    //print("Enter a number: ")
    //val m = readln().toIntOrNull()?.rem(2)?.equals(2) ?: false // if input value is null then give default value of false
    //?: 0 // checks for the value whether it is an integer if yes assign else
    // if null value and assign default value of 0
    //print("The number is even ??  $m")

    //kotlin ensures the call are made on only valid object hence null safety

//    val num3 = readln().toIntOrNull()
//    if (num3 != null) {
//        val isEven = num3.rem(2) == 0
//        print("Is even ? = $isEven")
//    }


}