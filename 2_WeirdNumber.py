# 2 - Weird Number

n = int(input("Enter an integer : "))

if (n%2==1 or n>=6 and n<=20):
    print("Weird")
elif ((n%2==0 and n > 20) or (n>=2 and n<=5)):
    print("Not Weird")
