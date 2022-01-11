def readExpress():
    astring = input("Calculation: ").replace(" ", "")
    lst = []
    for item in astring:
        if item not in ["0", "1", "2", "3" , "4", "5", "6", "7", "8", "9", "+", "-", "*", "^","/", "(", ")"]:
            print ("Unsupported Character: " + item)
            exit()
        lst.append(item)
        
    count = 0
    while count < len(lst) - 1:
        if lst[count].isdigit() and lst[count + 1] == "(":
            lst.insert(count+1 ,"*")            
        if lst[count].isdigit() and lst[count +1].isdigit():
            lst[count] += lst[count + 1]
            del lst[count + 1]
        else:
            count += 1
    return lst

def perform_operation(n1, sym, n2):
    if sym == "+":
        return str(float(n1) + float(n2))
    elif sym == "-":
        return str(float(n1) - float(n2))
    elif sym == "*":
        return str(float(n1) * float(n2))
    elif sym == "/":
        try:
            n = str(float(n1) / float(n2))
            return n
        except ZeroDivisionError:
            print ("error")
            exit()

def heirarchy(x):
    while len(x) != 1:
        count = 0
        while count < len(x) - 1:
            if x[count] == "(":
                if x[count + 2] == ")":
                    del x[count + 2]
                    del x[count]
            count += 1
        count = 0
        while count < len(x) - 1:
            if x[count] in ["*", "/"] and not (x[count+1] in ["(", ")"] or x[count-1] in ["(", ")"]):
                x[count - 1] = perform_operation(x[count - 1], x[count], x[count + 1])
                del x[count + 1]
                del x[count]
            count += 1
        count = 0
        while count < len(x) - 1:
            if x[count] in ["+", "-"] and not (x[count+1] in ["(", ")"] or x[count-1] in ["(", ")"]):
                x[count - 1] = perform_operation(x[count - 1], x[count], x[count + 1])
                del x[count + 1]
                del x[count]
            count += 1

expression = readExpress()
heirarchy(expression)
print (expression[0])