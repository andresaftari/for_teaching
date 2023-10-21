import pyautogui as p
import schedule as s
import time


def print_message():
    msg = 'morning again nelaa, hope you are doing well! <3'

    for i in range(10):
        p.typewrite(msg + '\n')


# Scheduling to send everyday at 05:00 A.M
s.every().day.at('05:00', tz='Asia/Jakarta').do(print_message)

while True:
    s.run_pending()
    time.sleep(3)
