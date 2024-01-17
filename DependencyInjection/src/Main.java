
public class Main {
    public static void main(String[] args) {
    	
        Logger logger = new SmsLogger();
        Logger logger1 = new EmailLogger();
        
//        EmailLogger emailLogger = new EmailLogger();
//        SmsLogger smsLogger = new SmsLogger();
        
        UserService userService = new UserService(logger1);

        userService.createUser("john_doe");
    }
}