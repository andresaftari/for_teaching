semester = int(input())
ipk = float(input())
eprt = int(input())
ski = input()

if 2.76 <= ipk <= 3.00:
    print("Memuaskan")
elif 3.01 <= ipk <= 3.50:
    print("Sangat Memuaskan")
elif ipk >= 3.51:
    if semester == 6 and eprt >= 450 and ski == "Ada":
        print("Cumlaude")
    elif semester == 7:
        print("Sangat Memuaskan")
