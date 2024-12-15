class Solution:
    def romanToInt(self, s: str) -> int:
        arr = {}
        arr['I'] = 1
        arr['V'] = 5
        arr['X'] = 10
        arr['L'] = 50
        arr['C'] = 100
        arr['D'] = 500
        arr['M'] = 1000
        sums = 0
        i = len(s)-1
        while i>=0:
            if i>0 and (s[i-1]=='I') and (s[i] == 'V' or s[i] == 'X'):
                sums+=arr[s[i]]-arr[s[i-1]]
                i-=2
            elif i>0 and (s[i-1]=='X') and (s[i] == 'L' or s[i] == 'C'):
                sums+=arr[s[i]]-arr[s[i-1]]
                i-=2
            elif i>0 and (s[i-1]=='C') and (s[i] == 'D' or s[i] == 'M'):
                sums+=arr[s[i]]-arr[s[i-1]]
                i-=2
            else:
                sums+=arr[s[i]]
                i-=1
        return sums
        