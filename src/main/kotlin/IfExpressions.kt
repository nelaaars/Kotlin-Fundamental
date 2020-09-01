fun main() {
    val nilai : Int = 95
    val penilaian: String
    penilaian = if (nilai >= 75) {
        "Nilai kamu $nilai, selamat ya!"
    } else {
        "Nilai kamu $nilai, silakan ikuti remidial."
    }
    print(penilaian)
}