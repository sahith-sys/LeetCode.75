class Solution:
    def reverseParentheses(self, s: str) -> str:
        arr = []
        for char in s:
            
            if char == ")":
                temp = []
                while arr and arr[-1] != "(":
                    temp.append(arr.pop())
                    
                arr.pop()
                arr.extend(temp)
            else:
                arr.append(char)
        return "".join(arr)
        