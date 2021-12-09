decimal  = int(input("Enter  a  decimal  integer: "))
if  decimal  == 0: 
    print(0) 
else: 
    print("Quotient Remainder Octal")
    octString  = "   "

while  decimal  >  0:
    remainder  =  decimal  %  8 
    decimal  = decimal  //  8 
    octString  =  str(remainder)  + octString
    print("%5d%8d%12s"  %  (decimal, remainder, octString))

print(" The Octal representation is ",  octString)
