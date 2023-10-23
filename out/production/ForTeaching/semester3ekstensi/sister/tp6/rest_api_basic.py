import sys

import requests
import json

BASE_URL = 'https://api.restful-api.dev/'
HEADERS = {'Content-Type': 'application/json'}


# POST NEW OBJECT DATA
def __post_data__(objectdata_):
    endpoint_url = BASE_URL + 'objects'
    payload = json.dumps(objectdata_)
    response = requests.post(endpoint_url, data=payload, headers=HEADERS)

    if response.status_code == 200:
        print('POST OBJECT success!')
        return response.text
    else:
        return 'Failed to POST OBJECT: ' + str(response.status_code)


# GET ALL OBJECT DATA
def __get_all_data__():
    endpoint_url = BASE_URL + 'objects'
    response = requests.get(endpoint_url, headers=HEADERS)

    if response.status_code == 200:
        return response.text
    else:
        return 'Failed to GET OBJECT: ' + str(response.status_code)


# GET SINGLE OBJECT DATA SPECIFIC BY ID
def __get_single_data__(id_):
    endpoint_url = BASE_URL + 'objects/' + str(id_)
    response = requests.get(endpoint_url, headers=HEADERS)

    if response.status_code == 200:
        return response.text
    else:
        return 'Failed to GET OBJECT: ' + str(response.status_code)


# UPDATE SINGLE OBJECT DATA SPECIFIC BY ID
def __update_single_data__(id_, objectdata_):
    endpoint_url = BASE_URL + 'objects/' + str(id_)
    payload = json.dumps(objectdata_)
    response = requests.put(endpoint_url, data=payload, headers=HEADERS)

    if response.status_code == 200:
        print('UPDATE OBJECT success!')
        return response.text
    else:
        return 'Failed to UPDATE OBJECT: ' + str(response.status_code) + ': ' + response.text


# DELETE SINGLE OBJECT DATA SPECIFIC BY ID
def __delete_single_data__(id_):
    endpoint_url = BASE_URL + 'objects/' + str(id_)
    response = requests.delete(endpoint_url, headers=HEADERS)

    if response.status_code == 200:
        print('DELETE OBJECT success!')
        return response.text
    else:
        return 'Failed to DELETE OBJECT: ' + str(response.status_code) + ': ' + response.text


if __name__ == '__main__':
    opsi = 0

    while True:
        print('===== Simple CRUD App =====')
        print('''
        1. Insert laptop
        2. Display all available laptops
        3. Display specific laptop by ID
        4. Edit specific laptop by ID
        5. Delete specific laptop by ID
        6. Exit
        ''')
        opsi = int(input('Pilih menu [1 / 2 / 3 / 4 / 5 / 6]: '))

        if opsi == 1:
            name = input('Masukkan nama laptop: ')
            year = int(input('Masukkan tahun release laptop [YYYY]: '))
            price = float(input('Masukkan harga laptop [1234.00]: '))
            cpu = input('Masukkan model CPU laptop: ')
            hdd = input('Masukkan Hard Drive size laptop [XGB / XTB]: ')

            objectdata = {
                'name': name,
                'data': {
                    'year': year,
                    'price': price,
                    'cpu': cpu,
                    'hdd': hdd
                }
            }

            print(__post_data__(objectdata))

        elif opsi == 2:
            print('Displaying Everything')
            print(__get_all_data__())

        elif opsi == 3:
            id_find = input('Masukkan ID laptop: ')
            print(__get_single_data__(id_find))

        elif opsi == 4:
            print('Displaying All Availables')
            print(__get_all_data__())

            # Data default tidak dapat diubah
            id_find = input('Masukkan ID laptop yang akan diubah [Selain ID 1 - 13]: ')
            if id_find is int:
                if int(id_find) <= 13:
                    print('Maaf, ID 1 - 13 tidak bisa diubah')

            name = input('Masukkan nama laptop: ')
            year = int(input('Masukkan tahun release laptop [YYYY]: '))
            price = float(input('Masukkan harga laptop [1234.00]: '))
            cpu = input('Masukkan model CPU laptop: ')
            hdd = input('Masukkan Hard Drive size laptop [XGB / XTB]: ')

            # Confirm sebelum edit
            confirm = input('Yakin akan mengubah? [Y/N]: ')

            if confirm == 'Y':
                objectdata = {
                    'name': name,
                    'data': {
                        'year': year,
                        'price': price,
                        'cpu': cpu,
                        'hdd': hdd
                    }
                }
                print(__update_single_data__(id_find, objectdata))
            else:
                print('Update dibatalkan!')

        elif opsi == 5:
            print('Displaying All Availables')
            print(__get_all_data__())

            # Data default tidak dapat dihapus
            id_find = input('Masukkan ID laptop yang akan dihapus [Selain ID 1 - 13]: ')
            if id_find is int:
                if int(id_find) <= 13:
                    print('Maaf, ID 1 - 13 tidak bisa diubah')

            # Confirm sebelum hapus
            confirm = input('Yakin akan menghapus? [Y/N]: ')

            if confirm == 'Y':
                print(__delete_single_data__(id_find))
            else:
                print('Delete dibatalkan!')

        elif opsi == 6:
            print('Bye!')
            sys.exit(0)

        else:
            print('Pilihan opsi tidak valid!')
