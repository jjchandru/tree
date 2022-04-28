package com.revature.dsa.tree;

public class TreeDemo {
	// Org - https://theorg.com/org/backflip/org-chart
	public static void main(String args[]) {
		Employee ceo = new Employee("Mike Barile", "CEO");
		Employee cfo = new Employee("Zach Boven", "COO & CFO");
		Employee cto = new Employee("Adam Foosaner", "CTO");
		Employee dop = new Employee("Alex Rausch", "Director of Product");
		Employee doo = new Employee("Brian Dandelet", "Director of Operations");
		Employee sse1 = new Employee("Tuguldur Baigalmaa", "Senior Software Engineer");
		Employee sse2 = new Employee("Ksenia Golovchik", "Senior Software Engineer");
		Employee sse3 = new Employee("Dmitry Khakhomov", "Senior Software Engineer");
		Employee sdp = new Employee("Anton Shatsila", "Senior Product Designer");
		Employee pmm = new Employee("JJ Bajko", "Performance Marketing Manager");
		Employee so1 = new Employee("Jordan Williams", "Support Operations");
		Employee so2 = new Employee("Morgan Geran", "Support Operations");
		
		Node<Employee> ceoNode = new Node<>(ceo);
		Node<Employee> cfoNode = new Node<>(cfo);
		Node<Employee> ctoNode = new Node<>(cto);
		Node<Employee> dopNode = new Node<>(dop);
		Node<Employee> dooNode = new Node<>(doo);
		ceoNode.addChild(cfoNode);
		ceoNode.addChild(ctoNode);
		ceoNode.addChild(dopNode);
		ceoNode.addChild(dooNode);
		
		ctoNode.addChild(sse1);
		ctoNode.addChild(sse2);
		ctoNode.addChild(sse3);
		
		dopNode.addChild(sdp);
		dopNode.addChild(pmm);
		
		dooNode.addChild(so1);
		dooNode.addChild(so2);
		
		//Node.traverse(ceoNode);
		
		Employee bajko = new Employee("JJ Bajko", "Performance Marketing Manager");
		System.out.println(ceoNode.find(bajko).getData());
	}
	
}
