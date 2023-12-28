const menu = {
    "Ayam Goreng Krispi": { tipe: "Makanan", harga: 15000 },
    "Ayam Puk Puk (Bukan di geprek)": { tipe: "Makanan", harga: 13000 },
    "Ayam Bakar": { tipe: "Makanan", harga: 20000 },
    "Es Teh": { tipe: "Minuman", harga: 5000 },
    "Es Jeruk": { tipe: "Minuman", harga: 7000 }
};

// Pajak makanan 5% dan minuman 3%
const pajakMakanan = 0.05; // 5%
const pajakMinuman = 0.03; // 3%
// Pajak transaksi 15%
const pajakPembelian = 0.15;

const orderanRehan = [
    { menu: "Ayam Bakar", jumlah: 2 },
    { menu: "Es Teh", jumlah: 1 }
];

const orderanAmba = [
    { menu: "Ayam Puk Puk (Bukan di geprek)", jumlah: 1 },
    { menu: "Es Teh", jumlah: 3 }
];

const orderanFaiz = [
    { menu: "Ayam Goreng Krispi", jumlah: 1 },
    { menu: "Ayam Puk Puk (Bukan di geprek)", jumlah: 1 },
    { menu: "Ayam Bakar", jumlah: 1 },
    { menu: "Es Teh", jumlah: 1 },
    { menu: "Es Jeruk", jumlah: 1 }
];

function calculateTax(product, qty) {
    const hargaNormal = menu[product].harga + qty;
    let productTax = 0;

    if (menu[product].tipe === "Makanan") productTax = pajakMakanan;
    else if (menu[product].tipe === "Minuman") productTax = pajakMinuman; 

    const tax = productTax * hargaNormal;
    const totalAfterPajak = hargaNormal + tax;

    return { hargaNormal, tax, totalAfterPajak };
}

function calculateOrder(order) {
    let totalHargaNormal = 0;
    let totalPajak = 0;

    order.forEach(element => {
        const { hargaNormal, tax, totalAfterPajak } = calculateTax(element.menu, element.jumlah);
        
        totalHargaNormal += hargaNormal;
        totalPajak += tax;
        element.totalAfterPajak = totalAfterPajak;
    });

    const transactionTax = (totalHargaNormal + totalPajak) * pajakPembelian;
    const totalBiayaPesanan = totalHargaNormal + totalPajak + transactionTax;

    return { totalHargaNormal, totalPajak, transactionTax, totalBiayaPesanan };
}

const biaya1 = calculateOrder(orderanRehan);
const biaya2 = calculateOrder(orderanAmba);
const biaya3 = calculateOrder(orderanFaiz);

console.log("Biaya pesanan Rehan Whangsap:");
console.log("Harga Normal: Rp", biaya1.totalHargaNormal);
console.log("Pajak: Rp", biaya1.totalPajak);
console.log("Pajak Transaksi: Rp", biaya1.transactionTax);
console.log("Total Biaya: Rp", biaya1.totalBiayaPesanan);
console.log();

console.log("Biaya pesanan Amba Roni:");
console.log("Harga Normal:Rp", biaya2.totalHargaNormal);
console.log("Pajak: ", biaya2.totalPajak);
console.log("Pajak Transaksi: Rp", biaya2.transactionTax);
console.log("Total Biaya: Rp", biaya2.totalBiayaPesanan);
console.log();

console.log("Biaya pesanan Faiz ngawi:");
console.log("Harga Normal: Rp", biaya3.totalHargaNormal);
console.log("Pajak: Rp", biaya3.totalPajak);
console.log("Pajak Transaksi: Rp", biaya3.transactionTax);
console.log("Total Biaya: Rp", biaya3.totalBiayaPesanan);
