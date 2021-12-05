decimal  = int(input("Enter  a  decimal  integer: "))
if  decimal  == 0: 
    print(0) 
else: 
    print("Quotient Remainder Octal")
bitString  = "   "

while  decimal  >  0:
    remainder  =  decimal  %  8 
    decimal  = decimal  //  8 
    bitString  =  str(remainder)  + bitString
    print("%5d%8d%12s"  %  (decimal, remainder, bitString))
    
print(" The Octal representation is ",  bitString)
