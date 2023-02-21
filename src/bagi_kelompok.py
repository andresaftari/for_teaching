import random

arr = [
    {'nim': 1301228514, 'name': 'Riko'},
    {'nim': 1301228512, 'name': 'Ilham'},
    {'nim': 1301228508, 'name': 'Iim'},
    {'nim': 1301228502, 'name': 'Sukri'},
    {'nim': 1301228479, 'name': 'Andre'},
    {'nim': 1301228484, 'name': 'Sayyid'},
    {'nim': 1301228505, 'name': 'Citra'},
    {'nim': 1301228443, 'name': 'Basari'},
    {'nim': 1301228506, 'name': 'Billy'},
    {'nim': 1301228511, 'name': 'Eka'},
    {'nim': 1301228507, 'name': 'Primanda'},
    {'nim': 1301228521, 'name': 'Indra'},
    {'nim': 1301228509, 'name': 'Efwandha'},
    {'nim': 1301213433, 'name': 'Oka'},
    {'nim': 1301228510, 'name': 'Widad'},
    {'nim': 1301228513, 'name': 'Kelvin'},
    {'nim': 1301228515, 'name': 'Dimas'},
]
team1 = []
team2 = []
team3 = []
team4 = []

for x in range(0, len(arr)):
    i = random.randint(0, len(arr) - 1)

    if len(team1) < 4:
        team1.append(arr[i].get('name'))
        arr.remove(arr[i])
    elif len(team2) < 4:
        team2.append(arr[i].get('name'))
        arr.remove(arr[i])
    elif len(team3) < 3:
        team3.append(arr[i].get('name'))
        arr.remove(arr[i])
    elif len(team4) < 3:
        team4.append(arr[i].get('name'))
        arr.remove(arr[i])

res = str(team1) + ' ' + str(team2) + ' ' + str(team3) + ' ' + str(team4)
print(res)
