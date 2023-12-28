function hitungPecahan(totalBayar, totalBelanja) {
    const daftarPecahan = [100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100];
    const pecahan = {};

    // Coba cari selisihnya
    const selisih = totalBayar - totalBelanja;
    let sisa = selisih;

    daftarPecahan.forEach(element => {
        const jumlahPecahan = Math.floor(sisa / element);

        // Cek pecahan
        if (jumlahPecahan > 0) {
            pecahan[element.toString()] = jumlahPecahan;
            sisa %= element;
        }
    });

    return pecahan;
}

const bayar1 = 10000;
const beli1 = 7500;

const bayar2 = 5000;
const beli2 = 1100;

const bayar3 = 178000;
const beli3 = 90500;

console.log(hitungPecahan(bayar1, beli1));
console.log(hitungPecahan(bayar2, beli2));
console.log(hitungPecahan(bayar3, beli3));