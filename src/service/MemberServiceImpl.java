package service;

import java.util.ArrayList;

import entity.Member;

public class MemberServiceImpl implements MemberService {

	@Override
	public String greet(int i) {
		String[] greetings = {"Good morning", "Hello", "Good evening"};
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		Member men1 = new Member(1, "linda", "linda@example.com");
		Member men2 = new Member(2, "James", "james@example.com");
		list.add(men1);
		list.add(men2);

		return list;
	}

	@Override
	public int sumOf(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}

}
