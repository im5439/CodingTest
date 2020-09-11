package test;

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
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(int i = 0; i < participant.length; i++){
            for(int j = 0; j < completion.length; j++){
                answer = participant[i];
                if(participant[i].equals(completion[j])){
                    answer = "";
                    completion[j] = "";
                    break;
                }
            }
            if(!answer.equals("")) break;
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
