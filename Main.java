
class DatabaseManager{
	
	public void AddDatabase(IDatabase database){
		database.add();
	}
	
	public void DeleteDatabase(IDatabase database){
		database.delete();
	}
	
	public void GetDatabase (IDatabase database){
		database.get();
	}
	
	public void UpdateDatabase(IDatabase database){
		database.update();
	}
}

public class Main {
	 public static void main(String[] args) {
		
		DatabaseManager manager = new DatabaseManager();
		manager.AddDatabase(new MysqlDatabase());
		manager.DeleteDatabase(new MysqlDatabase() );
		manager.GetDatabase(new MysqlDatabase());
		manager.UpdateDatabase(new MysqlDatabase());
		manager.AddDatabase(new MongoDatabase());
		manager.DeleteDatabase(new MongoDatabase());
		manager.GetDatabase(new MongoDatabase());
		manager.UpdateDatabase(new MongoDatabase());
		manager.AddDatabase(new OracleDatabase());
		manager.DeleteDatabase(new OracleDatabase());
		manager.GetDatabase(new OracleDatabase());
		manager.UpdateDatabase(new OracleDatabase());
		
		
	}

}
