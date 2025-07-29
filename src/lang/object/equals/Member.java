package lang.object.equals;

public class Member {
	String id;

	public Member() {
		super();
	}

	public Member(String id) {
		super();
		this.id = id;
	}

	// 객체를 매개변수로 받아서 그 객체가 Member 클래스로 만든 객체인지 확인하고
	// 맞으면 객체를 다운캐스팅 하고 member id값과 동일한지 비교하기
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
