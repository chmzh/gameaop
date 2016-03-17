package com.cmz.gameaop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Stream;

import org.aspectj.apache.bcel.generic.ReturnaddressType;

public class Test {
	public static void main(String[] args) throws IOException {
    	
//		File file = new File("test.log");
//		FileOutputStream outputStream = new FileOutputStream(file);
//		for(int i=0;i<100000000;i++){
//			String b = "1,2,3\r\n";
//			outputStream.write(b.getBytes());
//		}

/*		
		Function<Integer,String> converter = (i)-> Integer.toString(i);
	    
	    Function<String, Integer> reverse = (s)-> Integer.parseInt(s);
	   
	    System.out.println(converter.apply(3));
	    System.out.println(converter.andThen(reverse).apply(30));
		*/
		
/*		
    	Function<String, Boolean> b = context -> isGunSilent(context);
    	Function<Boolean,String> b1 = context -> isGunSilent1(context);
    	
    	System.out.println(b.andThen(b1).apply("a"));
    	
    	BiConsumer<Integer, Integer> c1 = (a,a1) -> add(a, a1);
    	c1.accept(1, 2);
    	*/
/*		
		JarFile jarFile = new JarFile("flume-ng-sdk-1.6.0.jar");
		Enumeration<JarEntry> entry=jarFile.entries();
		while (entry.hasMoreElements()) {
			JarEntry jarEntry = (JarEntry) entry.nextElement();
			System.out.println(jarEntry.getName());
		}
		*/
		
		Collection<Integer> ints = Arrays.asList(10,2,5,1,8);
		Stream<Integer> stream = ints.stream();
		stream.filter((i)->{return i!=1;}).sorted().forEach((i->{System.out.println(i);}));
		
	}
	
	private static void add(int a,int b){
		int c = a+b;
		System.out.println(c);
	}
	
	private static String isGunSilent1(Boolean boolean1){
		if(boolean1){
			return "OK";
		}else{
			return "NO";
		}
	}
	
    private static Boolean isGunSilent(String context){
    	if(context.equals("a")){
    		return true;
    	}
    	return false;
    }
    
    public <T> String test(T t){
    	return "";
    }
}
