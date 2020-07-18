def translate(script):
    alphasm = 'abcdefghijklmnopqrstuvwxyz'
    alphacp = alphasm.upper()
    reversesm = alphasm[::-1]
    reversecp = alphacp[::-1]
    s=''
    for char in script:
        if char in alphasm:
            x=alphasm.find(char)
            s=s+reversesm[x]
        elif char in alphacp:
            x=alphacp.find(char)
            s=s+reversecp[x]
        else:
            s=s+char
    return s

no = int(input())
no=no+no-1
s=['',]
for z in range(0, no):
    a = input()
    if z==0:
        s[z]=translate(a)
    else:
        s.append(translate(a))


for a in range(0,no):
    print(s[a])
