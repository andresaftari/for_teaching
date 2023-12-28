const readline = require('readline');

function isDuplicateFound(input) {
    const set = new Set();
    
    for (let i = 0; i < input.length; i++) {
        // Kalo ada angka yang dah masuk Set, ya duplicate :)
        if (set.has(input[i])) return true;
        set.add(input[i]);
    }

    // Gada angka yang duplikat berarti
    return false;
}

// Minta inputan dari user
const rl = readline.createInterface({input: process.stdin, output: process.stdout});

rl.question('', (inputUser) => { 
    // Sama kek soal 1 pake .replace(/[\[\]]/g, '') biar "nggak peduliin" si [ ] di input (kalo ada)
    const userData = inputUser.replace(/[\[\]]/g, '').split(',').map(Number);

    console.log(isDuplicateFound(userData));
    rl.close();
});
