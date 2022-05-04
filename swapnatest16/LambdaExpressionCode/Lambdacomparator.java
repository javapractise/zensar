class student{  
    int id;  
    String name;  
    float fees;  
    public student(int id, String name, float fees) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.fees = fees;  
    }  
}  
public class Lambdcomparator{  
    public static void main(String[] args) {  
        List<student> list=new ArrayList<student>();  
          
          
        list.add(new student(1,"swapna",25000f));  
        list.add(new student(3,"gopi",300f));  
        list.add(new student(2,"krishna",150f));  
          
        System.out.println("Sorting on the basis of name...");  
  
         
        Collections.sort(list,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        });  
        for(student p:list){  
            System.out.println(p.id+" "+p.name+" "+p.fees);  
        }  
  
    }  
}  