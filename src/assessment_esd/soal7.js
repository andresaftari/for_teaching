function chatTranslator(chat) {
    return chat
        .toLowerCase()
        .split('')
        .map(karakter => {
            if (karakter >= 'a' && karakter <= 'z') {
                // Kalo di ASCII, huruf a = 97, huruf z = 122
                // Jadi rumusnya harus dikurang 97 biar 0 terus + 21, karena 21 % 26 nanti 5
                // dari sini kita dapet hasilnya itu alfabet + 5
                return String.fromCharCode(((karakter.charCodeAt(0) - 97 + 21) % 26) + 97);
            } else {
                return karakter;
            }
        })
        .join('');
}

const chat1 = "xfqfr bfmdz";
const chat2 = "gjxtp lzj rfz ifkyfw jxi snm";
const chat3 = "gwt, gjxtp qz rfz rfpfs in bfwlty lfp?";
const chat4 = "fpz xfdfsl pfrz, rfz lfp ofin ufhfwpz";
const chat5 = "dfsl pnwnr xynhpjw otrtp pz pnhp ifwn lwzu";

console.log(chatTranslator(chat1));
console.log(chatTranslator(chat2));
console.log(chatTranslator(chat3));
console.log(chatTranslator(chat4));
console.log(chatTranslator(chat5));