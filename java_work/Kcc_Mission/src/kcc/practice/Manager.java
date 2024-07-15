package kcc.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Manager {
	ArrayList<PhoneInfo> arr;
	int count;

	public Manager() {
//		arr = new PhoneInfo[10];
		arr = new ArrayList<PhoneInfo>();
	}

	public void addPhoneInfo() {
		System.out.println("1. �Ϲ� 2. ȸ�� 3. ��â");
		String menu = DataInput.sc.nextLine();
		switch (menu) {
		case "1":
			System.out.print("�̸� :");
			String name = DataInput.sc.nextLine();
			System.out.print("��ȭ��ȣ :");
			String phoneNo = DataInput.sc.nextLine();
			System.out.print("������� :");
			String birth = DataInput.sc.nextLine();

			// �����ڸ� �迭������ ������ �� �ִ�!
			arr.add(new PhoneInfo(name, phoneNo, birth));
			break;
		case "2":
			System.out.print("�μ��� :");
			String dept = DataInput.sc.nextLine();
			System.out.print("��å�� :");
			String position = DataInput.sc.nextLine();
			System.out.print("�̸� :");
			name = DataInput.sc.nextLine();
			System.out.print("��ȭ��ȣ :");
			phoneNo = DataInput.sc.nextLine();
			System.out.print("������� :");
			birth = DataInput.sc.nextLine();
			arr.add(new Company(name, phoneNo, birth, dept, position));
			System.out.println(arr);
			break;
		case "3":
			System.out.print("������ :");
			String major = DataInput.sc.nextLine();
			System.out.print("�й� :");
			String year = DataInput.sc.nextLine();
			System.out.print("�̸� :");
			name = DataInput.sc.nextLine();
			System.out.print("��ȭ��ȣ :");
			phoneNo = DataInput.sc.nextLine();
			System.out.print("������� :");
			birth = DataInput.sc.nextLine();
			arr.add(new Universe(name, phoneNo, birth, major, year));
			System.out.println(arr);
			break;
		}

	}

	public void listPhoneInfo() {
		System.out.println("1. �Ϲ� 2. ȸ�� 3. ��â");
		String menu = DataInput.sc.nextLine();
		switch (menu) {
		case "1":
			Iterator<PhoneInfo> iter = arr.iterator();
			while (iter.hasNext()) {
				iter.next().show();
			}
			
			break;
		case "2":
			Iterator<PhoneInfo> iter2 = arr.iterator();
			while (iter2.hasNext()) {
				PhoneInfo c = iter2.next();
				if (c instanceof Company) {
					c.show();
				}
			}
			break;
		case "3":
			Iterator<PhoneInfo> iter3 = arr.iterator();
			while (iter3.hasNext()) {
				PhoneInfo u = iter3.next();
				if (u instanceof Universe) {
					u.show();
				}
			}
			break;
		}
	}

	public void searchPhoneInfo() {
		// �˻��ϰ����ϴ� �̸����� 1���� PhoneInfo ��ü�� ������ ����Ѵ�.
		System.out.println("�̸��� �Է����ּ���");
		String name = DataInput.sc.nextLine();
		int index = -1;
		for (int i = 0; i < arr.size(); i++) {
			if (name.equals(arr.get(i).getName())) {
				arr.get(i).show();
				System.out.println(arr.get(i));
				index = i;
				System.out.println(index);
			}
		}

		if (index == -1) {
			System.out.println("�˻��Ͻ� �̸��� �������� �ʽ��ϴ�.");
		}
	}

	public void updatePhoneInfo() {
		// �̸��� �Է� => �ش� phoneInfo ���� => ���� ��ȭ��ȣ �Է� => ��ȭ��ȣ ������ �Ϸ�
		System.out.println("�̸��� �Է����ּ���");
		String name = DataInput.sc.nextLine();
		int index = -1;
		for (int i = 0; i < arr.size(); i++) {
			if (name.equals(arr.get(i).getPhoneNo())) {
				System.out.println("�ٲٽ� ��ȭ��ȣ�� �Է����ּ���");
				String change = DataInput.sc.nextLine();
				arr.get(i).setPhoneNo(change);
				index = i;
			}
		}
		if (index == -1) {
			System.out.println("�ش� �̸��� �������� �ʽ��ϴ�.");
		}

	}

	public void deletePhoneInfo() {
		// �̸� �Է� => ��� ��ü �˻� => �ε��� ã�� => �ش� ��ü ����
		System.out.print("������ �̸�: ");
		String temp = DataInput.sc.nextLine();
		int num = -1;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).name.equals(temp)) {
				num = i;
			}
		}

		if (num == -1) {
			System.out.println("�ش� �̸��� �������� �ʽ��ϴ�.");
		} else {
//			for (int i = num; i < count; i++) {
//				if (i == arr.length - 1) {
//					arr[i] = null;
//				} else {
//					arr[i] = arr[i + 1];
//				}
//			}
//			count--;
			arr.remove(num);
		}

	}

	// ����
	public void phoneSort() {
		System.out.println("1. �Ϲ� 2. ȸ�� 3. ��â");
		String input = DataInput.sc.nextLine();
		switch (input) {
		case "1":
			System.out.println("1. �̸����� ���������ϱ� 2. �̸����� ���������ϱ� 3. ���� ���� ������� 4. ���� ���� �������");
			String key = DataInput.sc.nextLine();
			switch (key) {
			case "1":
				Collections.sort(arr, new Comparator<PhoneInfo>() {
					// �̸������� �������� (�� -> ��)
					@Override
					public int compare(PhoneInfo o1, PhoneInfo o2) {
						if (o1.getName().compareTo(o2.getName()) < 0) {
							return -1;
						} else if (o1.getName().compareTo(o2.getName()) > 0) {
							return 1;
						}
						return 0;
					}
				});
				break;
			case "2":
				Collections.sort(arr, new Comparator<PhoneInfo>() {
					// �̸������� ��������(�� -> ��)
					@Override
					public int compare(PhoneInfo o1, PhoneInfo o2) {
						if (o1.getName().compareTo(o2.getName()) > 0) {
							return -1;
						} else if (o1.getName().compareTo(o2.getName()) < 0) {
							return 1;
						}
						return 0;
					}
				});
				break;
			case "3":
				Collections.sort(arr, new Comparator<PhoneInfo>() {
					// ���� ���� �������
					@Override
					public int compare(PhoneInfo o1, PhoneInfo o2) {
						if (o1.getBirth().compareTo(o2.getBirth()) > 0) {
							return -1;
						} else if (o1.getBirth().compareTo(o2.getBirth()) < 0) {
							return 1;
						}
						return 0;
					}
				});
				break;
			case "4":
				Collections.sort(arr, new Comparator<PhoneInfo>() {
					// ���� ���� �������
					@Override
					public int compare(PhoneInfo o1, PhoneInfo o2) {
						if (o1.getBirth().compareTo(o2.getBirth()) > 0) {
							return 1;
						} else if (o1.getBirth().compareTo(o2.getBirth()) < 0) {
							return -1;
						}
						return 0;
					}
				});
				break;
			}
			break;
		
		}
	}

	public void phoneDataSave() {
		// phoneInfo ��ü �ҷ�����. -> ��ü�� file�� �����Ű��..! (�з�..? �ұ�?)
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("phone.txt"));
			oos.writeObject(arr);
			System.out.println("������ ���� �Ϸ�");
		} catch (Exception e) {
			System.out.println("������ ���� ����");
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void phoneDataLoad() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("phone.txt"));
			arr = (ArrayList<PhoneInfo>) ois.readObject();
			System.out.println("�ҷ����� �Ϸ�");
		} catch (Exception e) {
			System.out.println("����");
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


}