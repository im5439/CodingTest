package test;

import java.util.ArrayList;
import java.util.List;

public class Crane {

	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < moves.length; i++) {
//			for (int j = 0; j < board.length; j++) {
//				int k = moves[i] - 1;
//				if (board[j][k] == 0)
//					continue;
//				if (!list.isEmpty() && list.get(list.size() - 1) == board[j][k]) {
//					list.remove(list.get(list.size() - 1));
//					answer++;
//				} else {
//					list.add(board[j][k]);
//				}
//				board[j][k] = 0;
//				break;
//			}
//		}
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				int k = moves[i] - 1;
				if (board[j][k] == 0)
					continue;
				list.add(board[j][k]);
				board[j][k] = 0;
				break;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if (i != list.size()-1 && list.get(i) == list.get(i+1)) {
				list.remove(i);
				list.remove(i);
				answer++;
				i=-1;
			}
		}
		return answer * 2;
	}

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		Crane crane = new Crane();
		System.out.println(crane.solution(board, moves));

		int[][] board2 = new int[30][30];
		int[] moves2 = new int[1000];
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				board2[i][j] = 1;
			}
		}
		for (int i = 0; i < 1000; i++) {
			moves2[i] = 1;
		}

		System.out.println(crane.solution(board2, moves2));

	}

}
