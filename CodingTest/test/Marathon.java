package test;

import java.util.HashMap;
import java.util.Iterator;

public class Marathon {
/*
���� ����
������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.
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
