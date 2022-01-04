def readExpress():
    astring = input("Calculation: ").replace(" ", "")
    a_list = []
    for item in astring:
        if item not in ["0", "1", "2", "3" , "4", "5", "6", "7", "8", "9", "+", "-", "*", "^","/", "(", ")"]:
            print ("Unsupported Character: " + item)
            exit()
        a_list.append(item)
    count = 0

    while count < len(a_list) - 1:
        if a_list[count].isdigit() and a_list[count + 1] == "(":
            a_list.insert(count+1 ,"*")            
        if a_list[count].isdigit() and a_list[count +1].isdigit():
            a_list[count] += a_list[count + 1]
            del a_list[count + 1]
        else:
            count += 1
    return a_list


def perform_operation(n1, operand, n2):
    if operand == "+":
        return str(float(n1) + float(n2))
    elif operand == "-":
        return str(float(n1) - float(n2))
    elif operand == "^":
        return str(float(n1) ** float(n2))
    elif operand == "*":
        return str(float(n1) * float(n2))
    elif operand == "/":
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