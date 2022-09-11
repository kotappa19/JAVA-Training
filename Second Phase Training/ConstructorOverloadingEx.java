
public class ConstructorOverloadingEx {
	String name="Puneeth Rajkumar";
	int id=10,age=45;
	public ConstructorOverloadingEx() {
	}
	public ConstructorOverloadingEx(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public ConstructorOverloadingEx(int id, int age) {
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "ConstructorOverloadingEx [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
	
}
