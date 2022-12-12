import java.util.*

val listBuku = arrayListOf<Buku>()
fun main() {
    val scanner = Scanner(System.`in`)

    do {
        println("""
    ==========[Pilih Menu]========= 
    1. Insert Buku 
    2. Ubah Data Buku 
    3. Lihat Buku 
    4. Cari Buku Berdasarkan ISBN 
    5. Hapus Buku 
    6. Keluar! 
    ===============================
    """.trimIndent())

        print("Menu ke - ")

        when (scanner.nextInt()) {
            1 -> {
                println("Jumlah Buku")
                print("ISBN : ")
                val isbn = scanner.next()
                print("Judul : ")
                val judulBuku = scanner.next()
                print("Pengarang : ")
                val pengarang = scanner.next()
                print("Tahun Terbit : ")
                val tahunTerbit = scanner.next()
                print("Harga : ")
                val harga = scanner.next()
                print("Rating : ")
                val rating = scanner.nextFloat()

                listBuku.add(Buku(isbn, judulBuku, pengarang, tahunTerbit, harga, rating))
                println("Berhasil menambahkan buku!")
            }

            2 -> {
                val index = listBuku.size - 1

                print("Masukkan ISBN: ")
                val isbn = scanner.next()

                if (listBuku.isNullOrEmpty()) println("Tidak ada data buku!")
                else for (buku in listBuku) if (isbn.equals(listBuku[index].isbn, true)) {
                    val getIsbn: String = buku.isbn

                    print("Input Judul baru: ")
                    val editJudul = scanner.next()

                    print("Input Pengarang baru: ")
                    val editPengarang = scanner.next()

                    print("Input Tahun baru: ")
                    val editTahun = scanner.next()

                    print("Input Harga baru: ")
                    val editHarga = scanner.next()

                    print("Input Rating baru: ")
                    val editRating = scanner.nextFloat()

                    listBuku[index] = Buku(getIsbn, editJudul, editPengarang, editTahun, editHarga, editRating)
                }
            }

            3 -> {
                if (listBuku.isNullOrEmpty()) println("Tidak ada data buku!")
                else for (buku in listBuku) println(buku.toString())
            }

            4 -> {
                print("Masukkan ISBN: ")
                val findISBN = scanner.next()

                if (listBuku.isNullOrEmpty()) println("Tidak ada data buku!")
                else {
                    for (buku in listBuku) {
                        if (findISBN.equals(buku.isbn, true)) println(buku.toString())
                        else println("Buku dengan ISBN : $findISBN tidak ditemukan!")
                    }
                }
            }

            5 -> {
                val index = listBuku.size - 1

                print("Masukkan ISBN: ")
                val isbnToDelete = scanner.next()

                if (listBuku.isNullOrEmpty()) println("Tidak ada data buku!")
                else {
                    for (position in 1..listBuku.size) {
                        if (isbnToDelete.equals(listBuku[index].isbn, true)) {
                            listBuku.removeAt(index)
                            println("Data berhasil dinghapus")
                        } else println("Buku dengan ISBN : $isbnToDelete tidak ditemukan!")
                    }
                }
            }
        }
    } while (true)
}

data class Buku(val isbn: String, val judul: String, val pengarang: String, val tahunTerbit: String, val harga: String, val rating: Float) {
    override fun toString(): String {
        return """
            
        ISBN : $isbn
        Judul Buku : $judul
        Pengarang : $pengarang
        Tahun Terbit : $tahunTerbit
        Harga : $harga
        Rating : $rating
                
    """.trimIndent()
    }
}