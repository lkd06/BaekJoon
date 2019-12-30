package programmers.kakao;

import java.util.ArrayList;
import java.util.List;

public class LockKey {
	class Point{
		private int x,y;
		public Point(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	
	public boolean check() {
		return true;
	}
	
	public boolean solution(int[][] key, int[][] lock) {
		List<Point> Lpoint = new ArrayList<>();
		List<Point> Kpoint = new ArrayList<>();
		int kRow=key.length,kColumn=key[0].length;
		for(int i=0;i<kRow;i++) {
			for(int j=0;j<kColumn;j++) {
				if(key[i][j]==1) {
					Kpoint.add(new Point(i,j));
				}
			}
		}
		
		int lRow=lock.length, lColumn=lock[0].length;
		for(int i=0;i<lRow;i++) {
			for(int j=0;j<lColumn;j++) {
				if(lock[i][j]==0) Lpoint.add(new Point(i, j));
			}
		}
		if(Kpoint.size()<Lpoint.size()) return false;
        boolean answer = true;
        return answer;
    }
}
