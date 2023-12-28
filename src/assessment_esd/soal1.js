const readline = require('readline');

function calculateRating(input) {
    // Pastiin input ada (gaboleh kosong dan gaboleh null)
    if (!input || input.length == 0) return null;
    
    // Hitung rating terendah, tertinggi terus hitung rata-rata semuanya
    const lowestRate = Math.min(...input);
    const highestRate = Math.max(...input);
    const average = input.reduce((a, b) => a + b, 0) / input.length;

    // Return hasil hitungan tadi, tapi khusus rata-rata jadiin dia Float tapi 2 decimal aja
    return [lowestRate, highestRate, parseFloat(average.toFixed(2))];
}

// Minta inputan dari user
const rl = readline.createInterface({input: process.stdin, output: process.stdout});

rl.question('', (inputUser) => {
    // Karena inputUser String, jadi harus di-split (artinya kalo ketemu koma, berarti itu Number baru)
    // .replace(/[\[\]]/g, '') tuh buat "nggak peduliin" si [ ] di input, 
    // jadi walaupun ada atau gada tetep gadianggep, misalnya [1, 2, 3, 4] dibacanya 1, 2, 3, 4
    const userData = inputUser.replace(/[\[\]]/g, '').split(',').map(Number);
    // Hitung ()
    const outputData = calculateRating(userData);

    // Output (pake JSON.stringify biar ilangin spasi, misal dari [1, 2, 3] jadi [1,2,3])
    console.log(JSON.stringify(outputData));
    rl.close();
});