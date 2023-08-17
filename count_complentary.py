def complem(arr, target):
    count=0
    num_set=set()
    
    for num in arr:
        diff=target-num
        if diff in num_set:
            count+=1
        num_set.add(num)
    return count
    
arr=[1,2,3,4,5]
target=6
print(complem(arr, target))


op 
2
