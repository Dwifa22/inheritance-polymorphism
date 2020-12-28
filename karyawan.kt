package polymorphism



open class Karyawan : Orang() { var nip: String = "" var gaji: Int = 0

    fun berkerja() {
        println("saya bekerja dengan jumlah gaji $gaji")
    }
}