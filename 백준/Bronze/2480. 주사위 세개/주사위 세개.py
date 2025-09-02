import sys

input = lambda: sys.stdin.readline().rstrip()

dice = list(map(int, input().split()))
set_dice = set(dice)

if len(set_dice) == 1:
    print(10000 + list(set_dice)[0] * 1000)
elif len(set_dice) == 2:
    sorted_dice = sorted(dice)
    print(1000 + sorted_dice[1] * 100)
else:
    print(max(set_dice) * 100)