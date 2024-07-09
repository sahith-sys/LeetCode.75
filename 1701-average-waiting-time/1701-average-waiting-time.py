"""class Solution:
    def averageWaitingTime(self, customers: List[List[int]]) -> float:
        start,finish,cus_wait,sums = 0,0,0,0
        for i in range (len(customers)):
            for j in range(2):
                if i ==0:
                    finish = finish + customers[i][j]
                    cus_wait = finish -customers[i][i]
                else:
                    start = (start + customers[i][j])+((i+1)//2)
                    finish = start + customers[i][1]
                    cus_wait = finish - customers[i][0]
                    sums = sums + cus_wait
        return sums/len(customers)"""

class Solution:
    def averageWaitingTime(self, customers: List[List[int]]) -> float:
        start,finish,cus_wait,sums = 0,0,0,0
        
        for cus in customers:
            arr,timereq = cus
            finish = max(finish, arr) + timereq
            sums = sums + finish - arr
            
            
        return sums/len(customers)
        