public class Main {
    public static void main(String[] args){
        boolean isOnline = false;
        /* 
        if(isOnline){
            System.out.println("è online");
        } else {
            System.out.println("non è online");
        }
        */
        
        String result = (isOnline == true) ? "è online" : "non è online";
        
        System.out.println(result);
    }    
}
