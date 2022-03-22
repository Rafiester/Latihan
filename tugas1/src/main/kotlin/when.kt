fun main() {
    val day = 4

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday" // karena value yang dipilih ada 4, maka yang ditampilkan Thursday. Jika lebih dr 7 akan error
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)
}