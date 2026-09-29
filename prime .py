print("Check the number is prime or not?")
n = int(input("Enter a number: "))
if n<2:
    print("Not a prime number")
else:
    is_prime = True

    for i in range(2,n):
      if n%i==0:
        is_prime = False
        break
    if is_prime:
        print("Prime number")
    else:
        print("Not a prime number")