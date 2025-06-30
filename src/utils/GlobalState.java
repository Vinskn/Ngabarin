
package utils;

public class GlobalState {
    private static String username;
    private static int user_id;
    private static int leaderEvt;
    private static String email;
    
    private GlobalState(){};
    
    public static String getUsername(){
        return username;
    }
    
    public static int getUserID(){
        return user_id;
    }
    
     public static int getLeaderEvt(){
        return leaderEvt;
    }
     
    public static String getEmail(){
        return email;
    }
    
    public static void setUsername(String param_username){
        username = param_username;
    }
    
    public static void setUserID(int param_id){
        user_id = param_id;
    }
    
    public static void setLeaderEvt(int param_leadEvt){
        leaderEvt = leaderEvt;
    }
    
    public static void setEmail(String param_email){
        email = param_email;
    }
}
