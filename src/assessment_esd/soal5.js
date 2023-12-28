function jumlahKombinasi() {
    // Konversi nama ke huruf kecil dulu, terus apus spasi
    const formattedNama = "Naip Lovyu".toLowerCase().replace('/\s/g', '');
    let count = 0;

    for (let i = 0; i < formattedNama.length; i++) {
        for (let j = i + 1; j <= formattedNama.length; j++) {
            const kombinasi = formattedNama.slice(i, j);
            
            // Cek panjang kombinasi, gaboleh lebih dari 6 nih
            if (kombinasi.length <= 6) {
                count++;
                // Ini ga wajib di soal, 
                // tapi kalo mau liat isi kombinasinya apa aja, uncomment aja kode bawha ini :)
                // console.log(`Kombinasi ${count}: ${kombinasi}`);
            }
        }
    }

    return count;
}

console.log(`Jumlah kombinasi username unik: ${jumlahKombinasi()}`);