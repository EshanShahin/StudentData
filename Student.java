
/**
 * クラス Student の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Student
{
   String name,gender,country;
   int age,phone;
   void SetInfo(String x,String y,String z, int i,int j){
       name = x;
       gender = y;
       country = z;
       age = i;
       phone = j;  
    }
    
    void displayInfo(){
        System.out.println("Name :" +" "+name);
        System.out.println("Gender :"+" " +gender);
        System.out.println("Country :"+" " +country);
        System.out.println("Age :" +" "+age);
        System.out.println("phone :" +" "+phone);
        System.out.println("\n\n");
    }
    
    
}

