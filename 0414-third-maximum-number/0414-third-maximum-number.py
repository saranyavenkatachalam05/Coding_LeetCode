class Solution(object):
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n = sorted(set(nums))

        if len(n) < 3:
            return n[-1]
        return n[-3]