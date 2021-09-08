N=int(input())
sum=0
l=str(N)
for i in range(len(l)+1):
	j=int(N)%10
	N=(int(N)//10)
	sum+=(j**3)
if sum == N:
	print("Armstrong")
else:
    print(type(sum),type(N))
    print("Not Armstrong")
print(sum)

	   
