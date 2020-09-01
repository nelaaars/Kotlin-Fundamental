import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    print("Masukkan nilai : ")
    val nilai : Int = reader.nextInt()
    val grade = if (nilai <= 100 && nilai > 90) {
        "A"
    } else if (nilai <= 90 && nilai > 80) {
        "B"
    } else if (nilai <= 80 && nilai > 70) {
        "C"
    } else if (nilai <= 70 && nilai > 60) {
        "D"
    } else {
        "E"
    }
    print("Selamat! nilaimu $grade")
}