class DatabaseManager{
	public void AddDatabase(IDatabase database){
		database.add();
	}
	public void DeleteDatabase(IDatabase database){
		database.delete();
	}
	public void GetDatabase(IDatabase database){
		database.update();
	}
}
public class Main {
	public static void main(String[] args) {
		DatabaseManager manager= new DatabaseManager();
		manager.AddDatabase(new MysqlDatabase());
		manager.AddDatabase(new MongoDatabase());
		
		
	}

}
