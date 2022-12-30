import java.util.Scanner;
class WrongAgeException extends Exception{
	public String toString(){
		return ("WrongAge!!! Age cannot be negetive");
	}
}

class AgeException extends Exception{
	public String toString(){
		return("NotPossible!! Son's Age cannot be greater than Father's Age");	
	}
}

class Father{
	int father_age;
	Father(int x) throws WrongAgeException{
          	father_age=x;
       		if(father_age<0){
            		throw new WrongAgeException();
	}        
    }
}

class Son extends Father{
	int son_age;
    	Son(int x,int y) throws AgeException, WrongAgeException{
        		super(x);
        		son_age=y;
        		if(son_age<0){
            		throw new WrongAgeException();
        		}
        		if(son_age>=father_age){
            		throw new AgeException();
        }
    }
}


class Lab6{
	public static void main(String xx[]) {
        		try {
            		Scanner s=new Scanner(System.in);
            		System.out.println("Enter Son's age and Fathers age ");
           		int y=s.nextInt();
            		int x=s.nextInt();
            		Son so=new Son(x,y);
            		System.out.println("Father is " + so.father_age + " years old and son is  "+so.son_age + " years old");
        } 
		catch (WrongAgeException wa) {
         			System.out.println(wa);   
        		}
        		catch (AgeException a){
            		System.out.println(a);
        		}
        		catch (Exception e){
            		System.out.println("Age is Interger value");
        }
    }
}