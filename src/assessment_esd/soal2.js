const readline = require('readline');

function isPalindrome(str) {
    // Hapus spasi dan ubah huruf jadi lowercase
    const cleanedStr = str.toLowerCase().replace(/\s/g, '');

    // Bandingin kata / kalimat secara dibalik 
    // (bisa pake for loop sih, cuma biar easy aja)
    const reversedStr = cleanedStr.split('').reverse().join('');
    
    if (cleanedStr === reversedStr) return "eureeka!"; 
    else return "suka blyat";
}

// Minta inputan dari user
const rl = readline.createInterface({input: process.stdin, output: process.stdout});

rl.question('', (inputUser) => { 
    console.log(isPalindrome(inputUser));
    rl.close();
});
