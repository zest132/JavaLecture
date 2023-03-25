package joo.강의11;

public interface interfaceTest extends ParentImpl,GrandParentImpl{
	
	// 멤버변수는 public static final 이어야 한다.
    public static final int TEST = 30;
    
    //제어자를 생략해도 public static final 이 자동적용 된다.
    int MAX =30;
    
    //추상메서드 여야 한다.
    public abstract void test();
    //제어자를 생략해도 public abstract가 적용 된다.
    void MAX();
    
}
