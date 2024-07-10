class Solution:
    def minOperations(self, logs: List[str]) -> int:
        k = 0
        for log in logs:
            if log == "../":
                if k>0:
                   k=k-1
            elif log == "./":
                k = k+0
            else:
                k = k+1
        return k if k>0 else 0
        