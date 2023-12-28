function findAnakNakal(nama) {
    const count = {};

    // Itung anak anaknya, tandain mana yang nakal nih
    nama.forEach(element => count[element] = (count[element] || 0) + 1);

    // Yang poinnya lebih dari 1, itu anak nakal    
    const listAnakNakal = Object.keys(count).filter(anak => count[anak] > 1);
    
    if (listAnakNakal.length == 0) return "Semuanya anak baik"

    // Sort dari anak yang paling nakal (paling banyak jumlahnya ni)
    listAnakNakal.sort((a, b) => count[b] - count[a]);

    const anakTernakal = listAnakNakal[0];
    const anakTernakalLainnya = listAnakNakal.slice(1).join(' dan ');

    return `${anakTernakal} ${listAnakNakal.length > 1 ? 'dan ' + anakTernakalLainnya + ' ' : ''}Nackal`
}

const input1 = ["Bagas", "Dimas", "Bagas", "Bagas", "Indra", "Bagas", "Gilang", "Hana", "Eka", "Fajar"];
const input2 = ["Bagas", "Dimas", "Fajar", "Bagas", "Indra", "Gilang", "Eka", "Bagas", "Fajar", "Fajar"];
const input3 = ["Aisyah", "Bagas", "Dewi", "Dimas", "Eka", "Fajar", "Gilang", "Hana", "Indra", "Jihan"];

console.log(findAnakNakal(input1));
console.log(findAnakNakal(input2));
console.log(findAnakNakal(input3));