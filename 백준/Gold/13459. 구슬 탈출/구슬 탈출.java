import java.util.*;

public class Main {
    static class Ball {
        int rx, ry, bx, by, depth;

        public Ball(int rx, int ry, int bx, int by, int depth) {
            this.rx = rx;
            this.ry = ry;
            this.bx = bx;
            this.by = by;
            this.depth = depth;
        }
    }

    static int N, M;
    static char[][] board;
    //[rx][ry][bx][by]
    static boolean[][][][] visited;
    //상하좌우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        board = new char[N][M];
        int rx = 0, ry = 0, bx = 0, by = 0;

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == 'R') {
                    rx = i;
                    ry = j;
                    board[i][j] = '.';
                } else if (board[i][j] == 'B') {
                    bx = i;
                    by = j;
                    board[i][j] = '.';
                }
            }
        }

        visited = new boolean[N][M][N][M];
        System.out.println(bfs(rx, ry, bx, by));
    }

    static int bfs(int rx, int ry, int bx, int by) {
        Queue<Ball> queue = new LinkedList<>();
        queue.add(new Ball(rx, ry, bx, by, 0));
        visited[rx][ry][bx][by] = true;

        while (!queue.isEmpty()) {
            Ball now = queue.poll();
            if (now.depth >= 10) return 0;

            for (int i = 0; i < 4; i++) {
                int[] nextRed = move(now.rx, now.ry, dx[i], dy[i]);
                int[] nextBlue = move(now.bx, now.by, dx[i], dy[i]);

                //파란 구슬이 구멍에 들어가면 실패
                if (board[nextBlue[0]][nextBlue[1]] == 'O') continue;

                //빨간 구슬이 구멍에 들어갔고, 파란 구슬은 안 들어갔으면 성공
                if (board[nextRed[0]][nextRed[1]] == 'O') return 1;

                //두 구슬이 같은 위치라면
                if (nextRed[0] == nextBlue[0] && nextRed[1] == nextBlue[1]) {
                    if (nextRed[2] > nextBlue[2]) {
                        nextRed[0] -= dx[i];
                        nextRed[1] -= dy[i];
                    } else {
                        nextBlue[0] -= dx[i];
                        nextBlue[1] -= dy[i];
                    }
                }

                if (!visited[nextRed[0]][nextRed[1]][nextBlue[0]][nextBlue[1]]) {
                    visited[nextRed[0]][nextRed[1]][nextBlue[0]][nextBlue[1]] = true;
                    queue.add(new Ball(nextRed[0], nextRed[1], nextBlue[0], nextBlue[1], now.depth + 1));
                }
            }
        }
        return 0;
    }

    //구슬을 한 방향으로 굴리는 함수
    static int[] move(int x, int y, int dx, int dy) {
        int cnt = 0;
        while (true) {
            if (board[x + dx][y + dy] == '#' || board[x][y] == 'O') break;
            x += dx;
            y += dy;
            cnt++;
        }
        //x좌표, y좌표, 이동한 칸 수
        return new int[]{x, y, cnt}; 
    }
}
