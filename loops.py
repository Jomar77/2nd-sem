import sys
k = []
for i in range(sys.maxsize):                                # I couldn't figure out how to get an indefinite loop out of a for loop so I did this
    n = input("Enter a number or press Enter to quit: ")
    k += [n]                                                # puts in value in the array
    if k[i] == "":                                          # If the input is empty, then the loop breaks
        break
    arr = [int(x) for x in k]                               # Conversion of the string array to int array
    
print("The sum is ", sum(arr), "\nThe average is", sum(arr)/len(arr))
