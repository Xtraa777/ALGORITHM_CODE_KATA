import sys
input = sys.stdin.readline

N = int(input())
sizes = list(map(int, input().split()))
t, p = map(int, input().split())

total_t_bundles = sum([(x + t - 1) // t for x in sizes])

bundles = N // p
singles = N % p

print(total_t_bundles)
print(bundles, singles)