class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        x =0
        for val in operations:
            if val == "--X" or val == "X--":
                x = x -1
            else:
                x = x+1
        return x