package it.cast.jiewen.main;

import java.util.Scanner;

public class OrderStart {
	Orderutils orderutils = new Orderutils();


	/*********** �ֲ˵����� ***********/
	public void keyPrintln() {
		System.out.print("��ѡ��");
		Scanner scanner = new Scanner(System.in);
		int in = scanner.nextInt();
		choose(in, scanner);


	}

	/*********** switch��������ת ********/
	public void choose(int in, Scanner scanner) {
		int in2 = 0;
		switch (in) {
		case 1:
			System.out.println("***��Ҫ����***");
			return1(scanner);
			break;
		case 2:
			System.out.println("***�鿴�ʹ�***");
			return1(scanner);
			break;
		case 3:
			System.out.println("***ǩ�ն���***");
			return1(scanner);
			break;
		case 4:
			System.out.println("***ɾ������***");
			return1(scanner);
			break;
		case 5:
			System.out.println("***��Ҫ����***");
			return1(scanner);
			break;
		case 6:
			System.out.println("***ллʹ�ã���ӭ�´ι���***");
			break;
		default:
			System.out.println("�����������������,�����ֵӦ����1~6֮��");
			keyPrintln();
			break;
		}
		return1(scanner);
	}

	public void return1(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print("����0�������˵�������0~5�ַ�����:");
		int in1 = scanner.nextInt();
		if (in1 == 0) {
			print();
		} else {
			switch (in1) {
			case 1:
				orderutils.orderMeal(scanner);
				break;
			case 2:
				orderutils.seeOrder(scanner);
				break;
			case 3:
				orderutils.signOrder(scanner);
				break;
			case 4:
				orderutils.deleteOrder(scanner);
				break;
			case 5:
				orderutils.likeOrder(scanner);


				break;
			default:
				break;
			}
			choose(in1, scanner);
		}
	}



	/***************** ϵͳ�˵� **********/
	public void print() {
		System.out.println("��ӭʹ�á��Ի�����ϵͳ��");
		System.out.println("*********************************");
		System.out.println("1����Ҫ����");
		System.out.println("2���鿴�ʹ�");
		System.out.println("3��ǩ�ն���");
		System.out.println("4��ɾ������");
		System.out.println("5����Ҫ����");
		System.out.println("6���˳�ϵͳ");
		System.out.println("*********************************");
		keyPrintln();
	}

}
