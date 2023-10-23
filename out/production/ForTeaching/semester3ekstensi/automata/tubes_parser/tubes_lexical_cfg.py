# /*
# Kelompok 2:
# 1. Basari Resha (1301228443)
# 2. Prasidya Pramadresana Saftari (1301228479)
# 3. Naufal Sayyid (1301228484)
#  */

# /*
# Program berikut merupakan sebuah Lexical Analyzer yang dirancang untuk mengenali IF-ELSE program Python,
# lalu menganalisis input pengguna mulai dari kata kunci, simbol dan karakter yang digunakan
#
# Dalam bahasa Python, penulisan percabangan IF-ELSE memiliki cara yang berbeda dengan bahasa pemrograman lainnya.
# Pada bahasa Python, **kondisi boolean dalam IF-ELSE dapat ditulis tanpa ataupun menggunakan kurung ().**
#
# Selain itu, kata kunci yang digunakan juga berbeda, kata kunci **ELSE IF ditulis sebagai elif**.
#
# Selain itu juga, simbol maupun operasi boolean yang digunakan dalam kondisi dapat ditulis sebagai **"and"
# atau dengan simbol "&" untuk kondisi AND** atau **untuk kondisi OR ditulis dengan "or" maupun simbol "|"**.
#
# Kemudian, **dalam bahasa Python tidak ada kurung kurawal (*parentheses*)**.
# Fungsionalitas **kurung kurawal digantikan oleh titik dua ":" dan *tab indent* tiap baris**
# */

# /*
# Contoh penulisan IF-ELSE yang benar pada Python adalah sebagai berikut.f
#
# if a == 1:
#   print("One")
# elif a == 2:
#   print("Two")
# else:
#   print("Not One or Two")
# */


import re

# List semua keywords yang digunakan dalam IF ELSE Python
keywords = ['and', 'or', 'if', 'elif', 'else', 'is', 'in', 'with']

# List semua simbol yang digunakan dalam bahasa Python
symbols = [".", ";", ":", "!", "?", "/", "\\", ",", "@", "$", "&", ")", "(", "\"", "#",
           "[", "]", "{", "}", "=", "+=", "-=", "*=", "/=", "//=", "%=", "&=", "|=",
           "^=", ">>=", "<<=", "**=", "+", '-', '==']

# List semua accepted characters dalam bahasa Python
lowercase = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
             "p", "q", "r", "s", "t", "u", "v", "w", "x", "z"]
uppercase = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
             "S", "T", "U", "V", "W", "X", "Y", "Z"]
digit = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "_"]


# Periksa apakah input merupakan salah satu keywords yang digunakan pada IF ELSE Python
def is_keyword(src):
    if src in keywords:
        print(f'< KEYWORD {src} >')
    else:
        set_invalid(True)
    return src in keywords


# Periksa apakah input merupakan salah satu symbol yang diterima oleh Python
def is_symbol(src):
    if src in symbols:
        return True
    else:
        set_invalid(True)
    return src in symbols


# Periksa apakah input merupakan salah satu karakter yang diterima oleh Python
def is_accepted_char(src):
    try:
        # Periksa setiap pembuka dan penutup karakter apabila kutip
        src.index('"')
        return False
    except:
        pass
    try:
        # Periksa setiap pembuka dan penutup karakter apabila kutip
        src.index("'")
        return False
    except:
        pass
    try:
        # Periksa apabila ada input berupa digit integer
        int(src[0])
        return False
    except:
        pass

        # Apabila input berupa karakter atau digit, maka dianggap valid dan jadikan lowercase
        k = all(i in digit or uppercase or lowercase for i in src)
        if k:
            print(f'< CHAR {src} >')
        return k


# Lakukan pembacaan tiap baris
def break_line(line):
    words = line.split()
    new_words = []

    for i in range(len(words)):
        if words[i][0] in ("'", '"') and words[i][-1] in ("'", '"'):
            # Apabila hanya terdapat karakter biasa di dalam String yang diapit " atau '
            # maka langsung dianggap valid dan masukan ke dalam list new_words
            new_words.append(words[i][1:-1])
        else:
            # Apabila terdapat unique character, periksa dengan Python Regex,
            # apabila dianggap valid, masukan ke dalam list new_words
            find_regex = re.findall(r"\w+|[^\s\w]|[-:\w]", words[i])
            new_words.extend(find_regex)

    return new_words


# Periksa apakah input merupakan salah satu keywords yang digunakan pada IF ELSE Python
def get_strings(words):
    new_words = []
    adding = False
    temp = ''
    skip = False

    for w in words:
        if ('"' in w or "'" in w) and (w.count('"') < 2 and w.count("'") < 2):
            # Apabila ditemukan " atau ' tapi tidak ditutup, maka invalid
            adding = not adding
            set_invalid(True)
        if not adding:
            # Apabila invalid, di-skip
            new_words.append(temp + w)
            temp = ''
            skip = True
            set_invalid(True)
        if adding:
            # Apabila valid, tambahkan input ke dalam temp
            temp += w + ' '
        else:
            if skip:
                skip = False
            else:
                new_words.append(w)

    return new_words


def set_invalid(is_invalid):
    global invalid_
    invalid_ = is_invalid

    return is_invalid


# ================== MENJALANKAN PROGRAM ==================
invalid_ = False
is_skipped = False
arr = 0

try:
    # Baca custom file yang berisi TEST CASE,
    # pada studi kasus ini, digunakan sebuah default test file
    # bernama tubes_input.py
    input_user = open('tubes_input.py', 'r')

    # Mengubah baris perbaris dalam file menjadi list of String
    lines = input_user.readlines()

    # Lakukan perulangan untuk setiap baris kode
    for line in lines:
        # Apabila terdapat comment, skip baris tersebut,
        # dan lanjutkan ke baris selanjutnya
        if '#' in line:
            line = line[:line.index('#')]

        # Baca tiap baris dengan String parser yang sudah
        # dibuat (function break_line() untuk Regex
        # dan get_strings() untuk String)
        tokens = break_line(line)
        final = get_strings(tokens)

        # Lakukan perulangan untuk setiap hasil parsing
        for c, item in enumerate(final):
            arr += 1

            if not is_skipped:
                # Apabila valid dan tidak diskip,
                # lakukan pengecekan simbol dengan
                # function is_symbol() sebelumnya
                if is_symbol(item):
                    try:
                        # Lakukan pengecekan simbol
                        # index perindex, apabila simbol
                        # sudah dicek dengan Python Regex,
                        # langsung print symbol-nya
                        if is_symbol(item + final[c + 1]):
                            print(f'< SYMBOL {str(item + final[c + 1])} >')
                            is_skipped = True
                            set_invalid(False)
                        else:
                            # Apabila simbol tersebut
                            # bukan Regex, maka print
                            # symbol-nya lalu lanjutkan
                            # pembacaan kode berikutnya
                            print(f'< SYMBOL {item} >')
                            set_invalid(False)

                    except:
                        print(f'< SYMBOL {item} >')
                elif is_keyword(item):
                    # Apabila keyword valid, langsung lanjutkan
                    # pembacaan kode berikutnya
                    pass
                elif is_accepted_char(item):
                    # Apabila karakter valid, langsung lanjutkan
                    # pembacaan kode berikutnya
                    pass
                else:
                    # Apabila semua proses valid dan sudah
                    # mencapai kode terakhir, print kode
                    # terakhir
                    set_invalid(False)
                    print(f'< END {item} >\n')
            else:
                # Apabila pada proses sebelumnya ada yang
                # di-skip karena INVALID, maka tandai
                # dengan function set_invalid()
                is_skipped = False
                set_invalid(True)

except:
    # Apabila pada awal pembacaan file
    # ternyata file-nya tidak ada,
    # berikan notifikasi dan keluar
    print(f'< File tidak ditemukan>\n')
    quit(0)

# Apabila state proses ada yang INVALID = TRUE,
# maka print output bahwa input INVALID
if invalid_:
    print(f'< INVALID>\n')

# Tandai bahwa program telah selesai
# membaca file sampai akhir
print(f'< END OF FILE>')
