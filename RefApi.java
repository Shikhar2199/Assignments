package personClass.assignment;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;



public class RefApi {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
	{
		
		
	//	PERSON1 Pr = new PERSON1();
	//	Class data = Pr.getClass();
		Class classData3=Class.forName("personClass.assignment.PERSON1");
		
		PERSON1 POBJ = (PERSON1)classData3.newInstance();
		Method ToTest = classData3.getMethod("TesterA",null);
		
		System.out.println("\n--------------------------------INVOKE TRY-----------------------------------------\n");
		ToTest.invoke(POBJ, null);
		
		
		System.out.println("\n--------------------------------CONSTRUCTORS--------------------------------------\n");
		
		Constructor[] Consts = classData3.getConstructors();
		for(Constructor c:Consts) 
		{
		System.out.println(c.getName());
		}
		
		
		
		System.out.println("\n-----------------------------------FIELDS-------------------------------------------\n");
		
		Field[] Fieldss = classData3.getDeclaredFields(); 
		System.out.println(Fieldss);
		for(Field Fi:Fieldss)
		{
			System.out.println(Fi.getName());
			System.out.println(Fi);
		}
		
		
		Field[] fields=classData3.getFields();
		System.out.println(fields+" Couldn't Access Private Fields");
		for(Field field:fields) 
		{
			System.out.println(field.getName());
		}

		System.out.println("\n-------------------------------------METHODS----------------------------------------\n");	
		
		Method[] methods=classData3.getMethods();
		System.out.println(methods);
		for(Method method:methods) 
			System.out.println(method);
		
	}
}
