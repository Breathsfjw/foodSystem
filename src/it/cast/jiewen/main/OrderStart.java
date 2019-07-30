package it.cast.jiewen.main;

import java.util.Scanner;

public class OrderStart {
	Orderutils orderutils = new Orderutils();


	/*********** 分菜单界面 ***********/
	public void keyPrintln() {
		System.out.print("请选择：");
		Scanner scanner = new Scanner(System.in);
		int in = scanner.nextInt();
		choose(in, scanner);


	}

	/*********** switch语句控制跳转 ********/
	public void choose(int in, Scanner scanner) {
		int in2 = 0;
		switch (in) {
		case 1:
			System.out.println("***我要订餐***");
			return1(scanner);
			break;
		case 2:
			System.out.println("***查看餐袋***");
			return1(scanner);
			break;
		case 3:
			System.out.println("***签收订单***");
			return1(scanner);
			break;
		case 4:
			System.out.println("***删除订单***");
			return1(scanner);
			break;
		case 5:
			System.out.println("***我要点赞***");
			return1(scanner);
			break;
		case 6:
			System.out.println("***谢谢使用，欢迎下次光临***");
			break;
		default:
			System.out.println("输入错误，请重新输入,输入的值应该在1~6之间");
			keyPrintln();
			break;
		}
		return1(scanner);
	}

	public void return1(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.print("输入0返回主菜单，输入0~5字符继续:");
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



	/***************** 系统菜单 **********/
	public void print() {
		System.out.println("欢迎使用“吃货订餐系统”");
		System.out.println("*********************************");
		System.out.println("1、我要订餐");
		System.out.println("2、查看餐袋");
		System.out.println("3、签收订单");
		System.out.println("4、删除订单");
		System.out.println("5、我要点赞");
		System.out.println("6、退出系统");
		System.out.println("*********************************");
		keyPrintln();
	}

}
