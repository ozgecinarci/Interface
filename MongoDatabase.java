
public class MongoDatabase implements IDatabase {
	@Override
	public void add() {
		System.out.println("MongoDatabase Ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("MongoDatabase Silme");
		
	}

	@Override
	public void get() {
		System.out.println("MongoDatabase Elde Etme");
		
	}

	@Override
	public void update() {
		System.out.println("MongoDatabase Güncelleme");

}
}
