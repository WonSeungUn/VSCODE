package kosa.mission;

public class Mission2_4 {

	public static void main(String[] args) {
		// ���� ���� ���α׷����� �������� ������ �����غ���
		// ex) ��ȣ ���� ���� ���� ���� ���
		// ex)  1  90 80 70 240 80
		// ex)  2  50 40 30 120 40
		// =========================
		// ���� ���� 140 120 100
		// ���� ��� 70 60 50
		
		
		int score[][] = {
				{90,80,70},
				{50,40,30}
		};
		
		// ���� ����
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.print("��ȣ\t����\t����\t����\t����\t���\n");
		
		for(int i= 0 ; i <score.length ; i++) {
			int sum = 0;
			int avg = 0;
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print((i+1) +"\t");
			for(int j = 0 ; j < score[i].length ; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			
			avg = sum/score[i].length;
			System.out.print(sum + "\t");
			System.out.print(avg + "\t");
			System.out.println();
		} // end for
		
		System.out.println("===============================================");
		System.out.print("\t" + korTotal + "\t" + engTotal + "\t" + mathTotal + "\n");
		System.out.println("\t" + korTotal/score.length + "\t" + engTotal/score.length + "\t" + mathTotal/score.length + "\n");
		
	}

}
