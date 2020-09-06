package test;

import java.util.ArrayList;
import java.util.List;

public class Crane {
	
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < moves.length; i++) {
        	for(int j = 0; j < board.length; j++) {
        		if(board[j][moves[i]-1] == 0)
        			continue;
        		else {
        			list.add(board[j][moves[i]-1]);
//        			System.out.println("리스트에 들어가는 값 : "+board[j][moves[i]-1]);
        			board[j][moves[i]-1] = 0;
        			if(list.size() >= 2) {
//        				System.out.println("리스트 -1 : " + list.get(list.size()-1));
//        				System.out.println("리스트 -2 : " + list.get(list.size()-2));
        				if(list.get(list.size()-1) == list.get(list.size()-2)) {
        					list.remove(list.get(list.size()-1));
        					list.remove(list.get(list.size()-1));
        					answer += 2;
        				}
        			}
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		Crane crane = new Crane();
		System.out.println(crane.solution(board, moves));
		
	}

}
