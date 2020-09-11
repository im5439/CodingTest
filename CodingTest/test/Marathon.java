package test;

import java.util.HashMap;
import java.util.Iterator;

public class Marathon {
/*
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
 */
//	public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        for(int i = 0; i < participant.length; i++){
//            for(int j = 0; j < completion.length; j++){
//                answer = participant[i];
//                if(participant[i].equals(completion[j])){
//                    answer = "";
//                    completion[j] = "";
//                    break;
//                }
//            }
//            if(!answer.equals("")) break;
//        }
//        return answer;
//    }
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < participant.length; i++) {
			int count = 0;
			if(map.containsKey(participant[i]))
				count = map.get(participant[i]);
			if(count > 0) {
				map.put(participant[i], count + 1);
			} else
				map.put(participant[i], 1);
		}
		for(int i = 0; i < completion.length; i++) {
			int count = map.get(completion[i]);
			if(count == 1)
				map.remove(completion[i]);
			else if(count > 1)
				map.put(completion[i], count-1);
		}
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			answer = it.next();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Marathon marathon = new Marathon();
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(marathon.solution(participant, completion));
		
	}
	
}
