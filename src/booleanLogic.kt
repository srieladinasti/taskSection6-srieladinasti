fun main() {
    var umur = 23
    var single = true
    var perempuan = true
    var tinggi = 153

    var statusKawin = (umur > 26) && (single == true)
    println(statusKawin)

    var statusKawin2 = (umur < 26) || (single == false)
    println(statusKawin2)

    var statusKawin3 = (umur < 26) && (single == true)
    println(statusKawin3)

    var statusKawin4 = (umur > 26) || (single == false)
    println(statusKawin4)

    var jenisKelamin = (umur == 23) && (perempuan == true)
    println(jenisKelamin)

    var jenisKelamin1 = (umur > 23) || (perempuan == false)
    println(jenisKelamin1)

    var statusKawin5 = (umur == 23 && single == false) || (perempuan == true)
    println(statusKawin5)

    var jenisKelamin2 = (tinggi > 152) && (perempuan == false)
    println(jenisKelamin2)

    var jenisKelamin3 = (tinggi == 153) || (perempuan == false)
    println(jenisKelamin3)

    var jenisKelamin4 = (perempuan == true) && (tinggi < 150)
    println(jenisKelamin4)
}