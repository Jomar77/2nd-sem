def showIndex(ar, l):
    print([i for i in range(len(ar)) if l == ar[i]])
        
lst = [10,2,1,2,4,5,6,2]
l= 2
showIndex(lst , l)