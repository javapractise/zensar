interface employee{    
        
    default void emp(){    
        System.out.println("Hello employee");    
    }    
        
    void empMore(String msg);    
      
    static void empname(String msg){    
        System.out.println(msg);    
    }    
}    
 class DefaultMethods implements employee{    
    public void empMore(String msg){     
        System.out.println(msg);    
    }    
    public static void main(String[] args) {    
        DefaultMethods dm = new DefaultMethods();    
        dm.emp();                         
        dm.empMore("javamicroservices  training");          
        employee.empname("swapna chilakoori"); 
    }    
}    