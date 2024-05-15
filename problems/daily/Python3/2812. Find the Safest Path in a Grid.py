class Solution:
    def maximumSafenessFactor(self, grid: List[List[int]]) -> int:
        directions = [(0,1),(0,-1),(1,0),(-1,0)]
        n,m = len(grid),len(grid[0])

        def inBound(row,col):
            return 0 <= row < n and 0 <= col < m
        
        def bfs(grids):
            while grids:
                for _ in range(len(grids)):
                    row,col = grids.popleft()
                    value = grid[row][col]

                    for x,y in directions:
                        nextX,nextY = x + row, y + col
                        if inBound(nextX,nextY) and grid[nextX][nextY] == -1:
                            grid[nextX][nextY] = value + 1
                            grids.append((nextX,nextY))

        def safe():
            queue = [(-grid[0][0],0,0)]
            grid[0][0] = -1

            while queue:
                safenes, row , col = heappop(queue)
                
                if (row,col) == (n - 1 , m - 1):
                    return -safenes
                
                for x,y in directions:
                    nextX,nextY = x + row , y + col
                    if inBound(nextX,nextY) and grid[nextX][nextY] != -1:
                        heappush(queue,(-min(-safenes,grid[nextX][nextY]),nextX,nextY))
                        grid[nextX][nextY] = -1

            return -1
        grids = deque()

        for row in range(n):
            for col in range(m):
                if grid[row][col] == 1:
                    grids.append((row,col))
                    grid[row][col] = 0
                else:
                    grid[row][col] = -1

        bfs(grids)
        return safe()