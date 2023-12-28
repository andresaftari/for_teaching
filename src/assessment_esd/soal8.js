const listproduk = [
    { nama: 'TV', kategori: 'elektronik', harga: 1000 },
    { nama: 'headphone', kategori: 'elektronik', harga: 200 },
    { nama: 'baju', kategori: 'fashion', harga: 50 },
    { nama: 'gitar', kategori: 'musik', harga: 300 },
    { nama: 'sepatu', kategori: 'olahraga', harga: 80 },
    { nama: 'kamera', kategori: 'elektronik', harga: 600 }
];

const readline = require('readline');

const listpelanggan = [
    { nama: 'Rina', minat: ['elektronik', 'musik'], beli: ['TV', 'headphone'] },
    { nama: 'Budi', minat: ['fashion', 'musik'], beli: ['baju', 'gitar'] },
    { nama: 'Hartono', minat: ['olahraga', 'elektronik'], beli: ['sepatu', 'kamera'] }
]

function recommnadationByNama(nama) {
    const getpelanggan = listpelanggan.find(customer => customer.nama === nama);

    // Just in case pelanggan yang dicari gak ada
    if (!getpelanggan) return "Pelanggan tidak ditemukan";

    const recommended = listproduk
        .filter(product => getpelanggan.minat.includes(product.kategori))
        .map(product => product.nama);

    return recommended;
}

const rl = readline.createInterface({input: process.stdin, output: process.stdout});

rl.question('', (inputUser) => { 
    console.log(recommnadationByNama(inputUser));
    rl.close();
});