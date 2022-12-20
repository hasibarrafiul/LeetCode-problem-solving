class Solution:
    def isPalindrome(self, x: int) -> bool:
        str1 = ""
        str2 = ""
        for i in range(0, len(str(x))):
            str1= str1+str(x)[i]
            
        for i in range(len(str(x))-1, -1, -1):
            str2= str2+str(x)[i]
        if str1==str2:
            return True
