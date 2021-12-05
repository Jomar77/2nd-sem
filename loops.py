s = 0 
c = 0
while True:
    n = input("Enter a number or press Enter to quit: ")
    if n == "":
        break
    s += int(n)
    c += 1
print("The sum is ", s, "\nThe average is ", s/c)

