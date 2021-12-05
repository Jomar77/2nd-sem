octString  = input("Enter a  string  of  octal digits: ")
decimal  = 0
exponent  =  len(octString) - 1
print(exponent)
for  digit  in  octString: 
    decimal  = decimal  + int(digit)  *  8  **  exponent 
    exponent  =  exponent  - 1 
print ( "The integer  value is ", decimal)