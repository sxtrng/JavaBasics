public class EncapsulationOne {
	public static void main(String[] args) {
		
		Thing thing = new Thing();
		thing.setName("Thing One");
		String thingOneName = thing.getName();

		System.out.println(thingOneName);

		thing.setName("renamed");
		thingOneName = thing.getName();
		
		System.out.println(thingOneName);

	}
}


class Thing {

	private String name;

	Thing() {}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


}