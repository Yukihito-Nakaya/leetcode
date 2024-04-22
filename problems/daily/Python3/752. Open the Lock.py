class Solution:
    def openLock(self, deadends: List[str], target: str) -> int:
        visited = set(deadends)
        if '0000' in visited:
            return -1
        q = deque([(0, '0000')])
        did = set('0000')
            
        while q:
            steps, code = q.popleft()
            if code == target:
                return steps
            for i in range(4):
                for d in (-1, 1):
                    new_code = code[:i] + str((int(code[i]) + d) % 10) + code[i + 1:]
                    if new_code not in visited and new_code not in did:
                        q.append((steps + 1, new_code))
                        did.add(new_code)
        return -1
    