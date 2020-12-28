package polymorphism

class mahasiswa {
}
class Mahasiswa: Orang() { var nim: String = "" var prodi: String = ""

    fun belajar() {
        println("saya belajar di fakultas $prodi")
    }

    override fun perkenalan() {
        println("hai semua, perkenalkan namaku $nama dan aku tinggal di $alamat")
    }
}