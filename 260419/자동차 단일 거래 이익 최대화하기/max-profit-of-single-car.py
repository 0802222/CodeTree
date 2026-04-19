# n년
n = int(input())

# n년간 자동차 가격
car_price = list(map(int, input().split()))

min_price = car_price[0]
max_revenue = 0

for i in range (1, n):
    revenue = car_price[i] - min_price

    if revenue > max_revenue:
        max_revenue = revenue

    if car_price[i] < min_price:
        min_price = car_price[i]

print(max_revenue)