package it.cast.jiewen.main;

/************* �������� ************/
public class OrderInfo {
	int num;// �������
	String name; // ���涩��������
	String dishMeg; // �����Ʒ��������
	int times; // �����Ͳ�����
	String addresses; // �����Ͳ͵�ַ
	int states; // ���涩��״̬�� 0����Ԥ�� 1�������
	double sumPrices; // ���涩�����ܽ��
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
