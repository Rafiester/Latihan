fun main() {

    //Numbers
    val myNumShort: Short = 5000 //The Short data type can store whole numbers from -32768 to 32767
    val myNumByte: Byte = 100 //The Byte data type can store whole numbers from -128 to 127
    val myNumInt: Int = 100000 //The Int data type can store whole numbers from -2147483648 to 2147483647
    val myNumLong: Long = 15000000000L //The Long data type can store whole numbers from -9223372036854775808 to 9223372036854775808.

    //Float
    val myNumFloat: Float = 5.75F //The Float data type can store fractional numbers from 3.4e−038 to 3.4e+038

    //Double
    val myNumDouble: Double = 19.99 //The Double data type can store fractional numbers from 1.7e−308 to 1.7e+038

    //Scientific Numbers : A floating point number can also be a scientific number with an "e" or "E" to indicate the power of 10:
    val myNumFloat1: Float = 35E3F
    val myNumDouble2: Double = 12E4

    //Booelan
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false

    //Character
    val myGrade: Char = 'B'

    //Strings
    val myText: String = "Hello World"

    //Arrays
    val x: Int = 5
    val y: Long = x.toLong()

    println(myNumShort)
    println(myNumByte)
    println(myNumInt)
    println(myNumLong)
    println(myNumFloat)
    println(myNumDouble)
    println(myNumFloat1)
    println(myNumDouble2)
    println(isKotlinFun)
    println(isFishTasty)
    println(myGrade)
    println(myText)
    println(y)
}