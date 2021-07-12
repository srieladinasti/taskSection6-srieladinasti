fun main() {
    var nilaiAkhir = 75

    if(nilaiAkhir >= 0 && nilaiAkhir <= 30){
        println("Anda mendapatkan predikat E")
    }

    else if(nilaiAkhir > 30 && nilaiAkhir <= 50){
        println("Anda mendapatkan predikat D")
    }

    else if(nilaiAkhir > 50 && nilaiAkhir <= 70){
        println("Anda mendapatkan predikat C")
    }

    else if(nilaiAkhir > 70 && nilaiAkhir <= 85){
        println("Anda mendapatkan predikat B")
    }

    else if(nilaiAkhir > 85 && nilaiAkhir <=100){
        println("Anda mendapatkan predikat A")
    }

    else{
        println("Nilai tidak teridentifikasi!")
    }
}