import java.util.Scanner;
public class test {
	public static void main (String [] args ){
		Employee sc = new Employee ();//*//
		Evaluation ev = new Evaluation(sc.getId());
		Scanner input = new Scanner(System.in);
		int a=52;
		do{
			System.out.println("����� ����� ���� �������� ��� ��� ���������� ��� Manager ���! \n ��� �� ���������� ���� 1!");
			int an=input.nextInt();
			if(an!=1){
				break;
			}else {

				System.out.println("���� �� id: ");
					int id=input.nextInt();
				while(!ev.yparxid(id)){
					System.out.println("��� ������� �� id. �� ��� �� ���������������� ���� �� id \n ������ ���� ���� 0");
					id=input.nextInt();
					if(id==0){
						break;
					}
				}
				if(id==0){
					break;
				}
				if(ev.idExist(id)){
					System.out.println("�������� ���� ��� �������� ����������!" +"\n ��� �� ��������� ��� �� ���� ��������� (1/2) ; ");
					a=input.nextInt();
				}
				if ( a==1 || (ev.idExist(id )==false)){
					ev.questions(id);
				}
			}

		}while(true); //� ��������� ������� ��� �� ������ �����. � ������� ��� ������� ���� ���� � �� �������� �� ��������//
	}
}






