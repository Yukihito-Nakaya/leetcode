class Solution:
    def largestTriangleArea(self, points: List[List[int]]) -> float:

        def area(a, b, c):
            return 0.5 * abs(a[0] * (b[1] - c[1]) + b[0] * (c[1] - a[1]) + c[0] * (a[1] - b[1]))

        max_area = 0
        for i in range(len(points)):
            for j in range(i + 1, len(points)):
                for k in range(j + 1, len(points)):
                    max_area = max(max_area, area(points[i], points[j], points[k]))

        return max_area
    

# 0.5 * abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))
# The area of a triangle given by three points (x1, y1), (x2, y2), and (x3, y3) can be calculated using the formula:
# 0.5 * |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
# This formula is derived from the determinant of a matrix that includes the coordinates of the points. The absolute value is taken to ensure that the area is non-negative, regardless of the order of the points.

#another solution
class Solution(object):
    def largestTriangleArea(self, points):
        length = len(points)
        area = 0
        for i in range(length):
            for j in range(i, length):
                for k in range (j, length):
                    x1 = points[i][0]
                    x2 = points[j][0]
                    x3 = points[k][0]

                    y1 = points[i][1]
                    y2 = points[j][1]
                    y3 = points[k][1]

                    area = max(abs(0.5 * (x1*(y2-y3) + x2*(y3 - y1) + x3*(y1-y2))), area)
        return area
      