class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n == 0:
            return 1.0
        
        # Handle negative powers
        if n < 0:
            x = 1 / x
            n = -n
        
        result = 1.0
        current_product = x
        
        while n > 0:
            if n % 2 == 1:  # if current bit is 1
                result *= current_product
            current_product *= current_product  # square for next bit
            n //= 2
        
        return result
        