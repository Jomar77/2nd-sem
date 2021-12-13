data = [5,3,7] 

print((data[2]))
print(data[-1])
print(len(data))
print(data[0:2])
print(0 in data)
print(data + [2,10,5])
print(tuple(data))

data[0] = -5
data.append(10)
data.insert(2,22)
data.pop(1)
data.sort()
print(data)