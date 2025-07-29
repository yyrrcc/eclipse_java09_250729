package lang.object.tostring;

public class Member {
	String id;

	public Member() {
		super();
	}

	public Member(String id) {
		super();
		this.id = id;
	}

	// toString 오버라이딩해서 id값 가져오기
	@Override
	public String toString() {
		return id.toString();
	}

}
