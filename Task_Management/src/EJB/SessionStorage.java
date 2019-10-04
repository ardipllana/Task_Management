package EJB;

public class SessionStorage {
        private static int id;
	private static String username;
        private static String password;
        private static String name;
        private static String role;
	
        public SessionStorage(int idja, String user,String pass,String na, String roli) {
		id = idja;
                username = user;
                password = pass;
                name = na;
                role = roli;
	}

        public static void setSession(int idja, String user, String pass,String na,String roli) {
		id = idja;
                username = user;
                password = pass;
                name = na;
                role = roli;
	}
        
	public static void logout() {
                username = "";
                password = "";
                name = "";
                role = "";
        }
        
        public static int getId(){
                return id;
        }

	public static String getUsername() {
		return username;
	}
        
        public static String getName() {
		return name;
	}

	public static String getPassword() {
		return password;
        }
        
        public static String getRole() {
		return role;
        }
}