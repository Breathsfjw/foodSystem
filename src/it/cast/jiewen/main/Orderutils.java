package it.cast.jiewen.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/************* 系统功能 ************/
public class Orderutils {
	OrderInfo info = new OrderInfo();
	OrderInfoSet orderinrSet = new OrderInfoSet();
	Map<Integer, Dish> map = new HashMap<Integer, Dish>();
	/********* 添加订单 ***********/
	public void orderMeal(Scanner scanner) {

		map.put(1, new Dish("红烧带鱼", 38.8, 0));
		map.put(2, new Dish("鱼香肉丝", 20.0, 0));
		map.put(3, new Dish("时令鲜蔬", 10.8, 0));
		System.out.print("请输入用餐人姓名:");
		String name = scanner.next();
		System.out.println("序号" + "\t" + "菜名" + "\t" + "单价" + "\t" + "点赞数\t");
		for (Map.Entry<Integer, Dish> m : map.entrySet()) {
			System.out.println(m.getKey() + "\t" + m.getValue().getName() + "\t" + m.getValue().getPrice() + "\t"
					+ m.getValue().getLike());
		}
		System.out.print("请输入菜单编号:");
		int in = scanner.nextInt();
		System.out.print("请输入需要的份数:");
		int in1 = scanner.nextInt();
		System.out.print("请输入送餐时间（送餐时间是10点到20点整）:");
		int time = scanner.nextInt();
		System.out.print("请输入送餐地址:");
		String address = scanner.next();
		double sumPrices = map.get(in).getPrice() * in1;
		int num = 0;
		info.setNum(num++);
		info.setName(name);
		info.setDishMeg(map.get(in).getName() + in + "份");
		info.setAddresses(address);
		info.setStates(0);
		info.setTimes(time);
		info.setSumPrices(sumPrices);
		Map map2 = new HashMap<Integer, OrderInfo>();

		map2.put(num++, info);
		orderinrSet.setHashmap(map2);
		System.out.println("订餐成功！:");
		System.out.print("您订的是:" + map.get(in).getName() + in1 + "份");
		System.out.println("送餐时间：:" + time + "点");
		System.out.println(
				"餐费：:" + map.get(in).getPrice() * in1 + "送餐费用0.0元" + "总计" + map.get(in).getPrice() * in1 + "元");

	}

	/************ 查看订单 *********/
	public void seeOrder(Scanner scanner) {
		// TODO Auto-generated method stub
Map<Integer,OrderInfo> map3=orderinrSet.getHashmap();
		System.out.println(
				"订单编号" + "订单人" + "\t" + "订单地址" + "\t" + "送单时间" + "\t" + "订单价格" + "\t" + "订单信息" + "\t" + "订单状态");
for (Map.Entry<Integer, OrderInfo> m : map3.entrySet()) {
			System.out.println(m.getValue().getName() + "\t" + m.getValue().getAddresses() + "\t"
					+ m.getValue().getTimes() + "\t" + m.getValue().getSumPrices() + "\t" + m.getValue().getDishMeg()
					+ "\t" + m.getValue().getStates());
}
	}

	/********** 签收订单 *********/
	public void signOrder(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("请输入订单编号");
		int in = scanner.nextInt();
		Map<Integer, OrderInfo> map4 = orderinrSet.getHashmap();
		map4.get(in).setStates(1);
		System.out.println("签收订单成功");
	}

	/********** 删除订单 *********/
	public void deleteOrder(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("请输入订单编号");
		int in = scanner.nextInt();
		Map<Integer, OrderInfo> map5 = orderinrSet.getHashmap();
		map5.remove(in);
		System.out.println("删除订单成功");
	}

	/********* 我要点赞 *********/
	public void likeOrder(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("请输入菜品编号");
		int in = scanner.nextInt();
		map.get(in).setLike(map.get(in).getLike() + 1);
		System.out.println("点赞成功");
	}
}
