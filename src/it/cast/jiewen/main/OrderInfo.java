package it.cast.jiewen.main;

/************* 订单对象 ************/
public class OrderInfo {
	int num;// 订单编号
	String name; // 保存订餐人名称
	String dishMeg; // 保存菜品名及份数
	int times; // 保存送餐日期
	String addresses; // 保存送餐地址
	int states; // 保存订单状态： 0：已预订 1：已完成
	double sumPrices; // 保存订单的总金额
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDishMeg() {
		return dishMeg;
	}

	public void setDishMeg(String dishMeg) {
		this.dishMeg = dishMeg;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public String getAddresses() {
		return addresses;
	}

	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}

	public int getStates() {
		return states;
	}

	public void setStates(int states) {
		this.states = states;
	}

	public double getSumPrices() {
		return sumPrices;
	}

	public void setSumPrices(double sumPrices) {
		this.sumPrices = sumPrices;
	}

}
