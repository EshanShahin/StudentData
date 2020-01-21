
public class Test
{
    public static void main(String[]args){
        Student student1 = new Student();
        student1.SetInfo("Bhuiyan Md Shahin","Male","Bangladesh",25,25960982);
        student1.displayInfo();
        
        Student student2 = new Student();
        student2.SetInfo("Eshan Shahin","Male","Bangladesh",26,1813127519);
        student2.displayInfo();
        
        Student student3 = new Student();
        student3.SetInfo("Rubel Bhuiyan","Male","Canada",24,187591182);
        student3.displayInfo();
        
        
        Student student4 = new Student();
        student4.SetInfo("Gomez","Female","America",27,568273485);
        student4.displayInfo();
        
    }
    
}