fun main() {
    var umur = 19
    var status = "legal"

    if (umur > 15 && status == "legal"){
        println("Daftar")
    }

    else{
        println("Tidak bisa daftar karena umur tidak cukup")
    }

    var foto = "4x6"
    var warnaLatarFoto = "biru"

    if (foto == "4x6" && warnaLatarFoto == "biru"){
        println("Foto sesuai")
    }

    else{
        "Ukuran foto atau Warna latar foto tidak sesuai!"
    }

    var tinggi = 155

    if (tinggi >= 155)
    {
        println("Lanjutkan pendaftaran")
    }

    else{
        println("Tinggi tidak sesuai")
    }

    var jenisKelamin = "perempuan"

    if (jenisKelamin == "perempuan")
    {
        println("Lanjutkan pendaftaran")
    }

    else{
        println("Jenis kelamin tidak sesuai")
    }

    var statusKawin = "belum menikah"

    if (statusKawin == "menikah")
    {
        println("Status tidak sesuai")
    }

    else{
        println("Simpan data pendaftaran")
    }
}