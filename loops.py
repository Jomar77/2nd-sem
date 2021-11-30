import sys
k = []
for i in range(sys.maxsize):                    # I couldn't figure out how to get an indefinite loop out of a for loop so I did this
    n = input("Enter a number or press Enter to quit: ")
    k += [n]
    if k[i] == "":
        break
    arr = [int(x) for x in k]
print("The sum is ", sum(arr), "\nThe average is", sum(arr)/len(arr))
