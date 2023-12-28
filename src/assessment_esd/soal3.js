function findPencuriKue() {
    const suspect = ["Ningguang", "Hutao", "Xiao", "Childe"];

    // Dalam teka-teki, ada saat kue masih utuh di point tertentu
    // Kita catet dulu aja isUtuh = True
    let isUtuh = true;

    // Analisis dimulai dari sini :
    for (let i = 0; i < suspect.length; i++) {
        if (suspect[i] === "Xiao") {
            // Gamungkin, pasti auto aman, soalnya kata teka-teki gini,
            // Kue masih utuh pas Xiao ngefoto nih, bukan suspect lagi
            continue;
        }

        // Cek behavior temen-temennya nih
        switch (suspect[i]) {
            case "Ningguang":
                // Ningguang selalu bulak-balik cek kue 
                // sebelum ngasi kado, tapi masih suspect
                isUtuh = false;
                break;

            case "Hutao":
                // Hutao ngasi kado, tanpa liat kue samsek,
                // dia gatau apa-apa berarti, gatau bahkan ada kue
                break;

            case "Childe":
                // Childe bawa air mineral, 
                // terus naro di meja sebelum ngasi kado,
                // suspect nih
                isUtuh = false;
                break;
            
            default:
                break;
        }
    }

    if (isUtuh) console.log("Tidak ada teman yang mengambil kue");
    else console.log("Yang mengambil kue adalah Ningguang atau Childe");
}

findPencuriKue();