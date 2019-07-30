package it.cast.jiewen.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/************* ϵͳ���� ************/
public class Orderutils {
	OrderInfo info = new OrderInfo();
	OrderInfoSet orderinrSet = new OrderInfoSet();
	Map<Integer, Dish> map = new HashMap<Integer, Dish>();
	/********* ��Ӷ��� ***********/
	public void orderMeal(Scanner scanner) {

		map.put(1, new Dish("���մ���", 38.8, 0));
		map.put(2, new Dish("������˿", 20.0, 0));
		map.put(3, new Dish("ʱ������", 10.8, 0));
		System.out.print("�������ò�������:");
		String name = scanner.next();
		System.out.println("���" + "\t" + "����" + "\t" + "����" + "\t" + "������\t");
		for (Map.Entry<Integer, Dish> m : map.entrySet()) {
			System.out.println(m.getKey() + "\t" + m.getValue().getName() + "\t" + m.getValue().getPrice() + "\t"
					+ m.getValue().getLike());
		}
		System.out.print("������˵����:");
		int in = scanner.nextInt();
		System.out.print("��������Ҫ�ķ���:");
		int in1 = scanner.nextInt();
		System.out.print("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10�㵽20������:");
		int time = scanner.nextInt();
		System.out.print("�������Ͳ͵�ַ:");
		String address = scanner.next();
		double sumPrices = map.get(in).getPrice() * in1;
		int num = 0;
		info.setNum(num++);
		info.setName(name);
		info.setDishMeg(map.get(in).getName() + in + "��");
		info.setAddresses(address);
		info.setStates(0);
		info.setTimes(time);
		info.setSumPrices(sumPrices);
		Map map2 = new HashMap<Integer, OrderInfo>();

		map2.put(num++, info);
		orderinrSet.setHashmap(map2);
		System.out.println("���ͳɹ���:");
		System.out.print("��������:" + map.get(in).getName() + in1 + "��");
		System.out.println("�Ͳ�ʱ�䣺:" + time + "��");
		System.out.println(
				"�ͷѣ�:" + map.get(in).getPrice() * in1 + "�Ͳͷ���0.0Ԫ" + "�ܼ�" + map.get(in).getPrice() * in1 + "Ԫ");

	}

	/************ �鿴���� *********/
	public void seeOrder(Scanner scanner) {
		// TODO Auto-generated method stub
Map<Integer,OrderInfo> map3=orderinrSet.getHashmap();
		System.out.println(
				"�������" + "������" + "\t" + "������ַ" + "\t" + "�͵�ʱ��" + "\t" + "�����۸�" + "\t" + "������Ϣ" + "\t" + "����״̬");
for (Map.Entry<Integer, OrderInfo> m : map3.entrySet()) {
			System.out.println(m.getValue().getName() + "\t" + m.getValue().getAddresses() + "\t"
					+ m.getValue().getTimes() + "\t" + m.getValue().getSumPrices() + "\t" + m.getValue().getDishMeg()
					+ "\t" + m.getValue().getStates());
}
	}

	/********** ǩ�ն��� *********/
	public void signOrder(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("�����붩�����");
		int in = scanner.nextInt();
		Map<Integer, OrderInfo> map4 = orderinrSet.getHashmap();
		map4.get(in).setStates(1);
		System.out.println("ǩ�ն����ɹ�");
	}

	/********** ɾ������ *********/
	public void deleteOrder(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("�����붩�����");
		int in = scanner.nextInt();
		Map<Integer, OrderInfo> map5 = orderinrSet.getHashmap();
		map5.remove(in);
		System.out.println("ɾ�������ɹ�");
	}

	/********* ��Ҫ���� *********/
	public void likeOrder(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("�������Ʒ���");
		int in = scanner.nextInt();
		map.get(in).setLike(map.get(in).getLike() + 1);
		System.out.println("���޳ɹ�");
	}
}
