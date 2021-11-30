n = int(input(" Enter range of list: "))
newlist = [(x*2) for x in range(n) if (x%2 == 0)]
print(newlist)
