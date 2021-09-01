package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import dao.PeriodicElementImporter;
import dao.PeriodicTable;
import dao.PeriodicTableList;
import dto.PeriodicElement;
import dto.State;
import dto.Type;

public class Lab8 {
	
	static List<PeriodicElement> pe = new ArrayList<>();
	public static void main(String[] args){
		List<PeriodicElement> pe=PeriodicElementImporter.loadCSV("ptable.csv");
		pe.forEach(System.out::println);
		System.out.println();

		PeriodicElement[] pp = pe.toArray(new PeriodicElement[pe.size()]);
		
		PeriodicTable ptable = new PeriodicTable(pp);
		PeriodicTableList plist = new PeriodicTableList(pe);
		Collections.shuffle(pe);
		System.out.println("shuffle");
		pe.forEach(System.out::println);
		try {
			PeriodicElementImporter.saveCSV("shuffle.txt", pe);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println();
		
		System.out.println("plist find test");
		System.out.println("Please enter [number] of PeriodicElement:");
		int num=UserInput.getInteger();
		PeriodicElement pa1 = plist.findElement(predicate -> predicate.getNumber()==num);
		System.out.println(pa1);
		System.out.println();
		
		System.out.println("Please enter [symbol] of PeriodicElement:");
		String symbol=UserInput.getString();
		PeriodicElement pa2=plist.findElement(predicate->predicate.getSymbol().equals(symbol));
		System.out.println(pa2);
		System.out.println();
		
		System.out.println("Please enter [name] of PeriodicElement:");
		String name=UserInput.getString();
		PeriodicElement pa3=plist.findElement(predicate->predicate.getName().equals(name));
		System.out.println(pa3);
		System.out.println();
		
		System.out.println("Please enter [weight] of PeriodicElement:");
		Double weight=UserInput.getDouble();
		PeriodicElement pa4=plist.findElement(predicate->predicate.getWeight()==weight);
		System.out.println(pa4);
		System.out.println();
		
		System.out.println("Please enter [period] of PeriodicElement:");
		int period=UserInput.getInteger();
		PeriodicElement[] pa5=plist.findElements(predicate->predicate.getPeriod()==period);
		List<PeriodicElement> pa55=Arrays.asList(pa5);
		for(PeriodicElement p:pa5)
			System.out.println(p);
		try {
			PeriodicElementImporter.saveCSV("plist find period.txt", pa55);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Please enter [group] of PeriodicElement:");
		int group=UserInput.getInteger();
		PeriodicElement[] pa6=plist.findElements(predicate->predicate.getGroup()==group);
		List<PeriodicElement> pa66=Arrays.asList(pa6);
		for(PeriodicElement p:pa6)
			System.out.println(p);
		try {
			PeriodicElementImporter.saveCSV("plist find group.txt", pa66);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Please enter [Type] of PeriodicElement:");
		Type type=UserInput.getType();
		PeriodicElement[] pa7=plist.findElements(predicate->predicate.getType()==type);
		List<PeriodicElement> pa77=Arrays.asList(pa7);
		for(PeriodicElement p:pa7)
			System.out.println(p);
		try {
			PeriodicElementImporter.saveCSV("plist find type.txt", pa77);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Please enter [State] of PeriodicElement:");
		State state=UserInput.getState();
		PeriodicElement[] pa8=plist.findElements(predicate->predicate.getState()==state);
		List<PeriodicElement> pa88=Arrays.asList(pa8);
		for(PeriodicElement p:pa8)
			System.out.println(p);
		try {
			PeriodicElementImporter.saveCSV("plist find state.txt", pa88);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();

		System.out.println("ptable find test");
		System.out.println("Please enter [number] of PeriodicElement:");
		int num1=UserInput.getInteger();
		PeriodicElement pa9 = ptable.findElement(predicate -> predicate.getNumber()==num1);
		System.out.println(pa9);
		
		System.out.println("Please enter [symbol] of PeriodicElement:");
		String symbol1=UserInput.getString();
		PeriodicElement pa10=plist.findElement(predicate->predicate.getSymbol().equals(symbol1));
		System.out.println(pa10);

		
		System.out.println("Please enter [name] of PeriodicElement:");
		String name1=UserInput.getString();
		PeriodicElement pa11=plist.findElement(predicate->predicate.getName().equals(name1));
		System.out.println(pa11);
		System.out.println();
		
		
		System.out.println("Please enter [weight] of PeriodicElement:");
		Double weight1=UserInput.getDouble();
		PeriodicElement pa12=plist.findElement(predicate->predicate.getWeight()==weight1);
		System.out.println(pa12);
		System.out.println();
		
		System.out.println("Please enter [period] of PeriodicElement:");
		int period1=UserInput.getInteger();
		PeriodicElement[] pa13=plist.findElements(predicate->predicate.getPeriod()==period1);
		List<PeriodicElement> pa130=Arrays.asList(pa13);
		for(PeriodicElement p:pa13)
			System.out.println(p);
		try {
			PeriodicElementImporter.saveCSV("ptable find period.txt", pa130);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Please enter [group] of PeriodicElement:");
		int group1=UserInput.getInteger();
		PeriodicElement[] pa14=plist.findElements(predicate->predicate.getGroup()==group1);
		List<PeriodicElement> pa140=Arrays.asList(pa14);
		for(PeriodicElement p:pa14)
			System.out.println(p);
		try {
			PeriodicElementImporter.saveCSV("ptable find group.txt", pa140);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Please enter [Type] of PeriodicElement:");
		Type type1=UserInput.getType();
		PeriodicElement[] pa15=plist.findElements(predicate->predicate.getType()==type1);
		List<PeriodicElement> pa150=Arrays.asList(pa15);
		for(PeriodicElement p:pa15)
			System.out.println(p);
		try {
			PeriodicElementImporter.saveCSV("ptable find type.txt", pa150);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("Please enter [State] of PeriodicElement:");
		State state1=UserInput.getState();
		PeriodicElement[] pa16=plist.findElements(predicate->predicate.getState()==state1);
		List<PeriodicElement> pa160=Arrays.asList(pa16);
		for(PeriodicElement p:pa16)
			System.out.println(p);
		try {
			PeriodicElementImporter.saveCSV("ptable find state.txt", pa160);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();

		System.out.println("pList sort test");
		System.out.println("sort test:Number");
		Collections.sort(pe);
		pe.forEach(System.out::println);
		try {
			PeriodicElementImporter.saveCSV("pList sort number.txt", pe);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("sort test:Symbol");
		plist.Symbolsort();
		pe.forEach(System.out::println);
		System.out.println();
		
		System.out.println("sort test:Name");
		plist.Namesort();
		pe.forEach(System.out::println);
		System.out.println();
		
		System.out.println("sort test:Weight");
		plist.Weightsort();
		pe.forEach(System.out::println);
		System.out.println();
		
		System.out.println("sort test:Period");
		plist.Periodsort();
		pe.forEach(System.out::println);
		System.out.println();

		
		System.out.println("sort test:Group");
		plist.Groupsort();
		pe.forEach(System.out::println);
		System.out.println();

		
		System.out.println("sort test:Type");
		plist.Typesort();
		pe.forEach(System.out::println);
		System.out.println();

		
		System.out.println("sort test:State");
		plist.Statesort();
		pe.forEach(System.out::println);
		System.out.println();

		System.out.println();
		
		System.out.println("pTable sort test");
		System.out.println("sort test:Number");
		ptable.Numbersort();
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();
		
		System.out.println("pTable sort test");
		System.out.println("sort test:Symbol");
		ptable.Symbolsort();
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();
		
		System.out.println("pTable sort test");
		System.out.println("sort test:Name");
		ptable.Namesort();
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();

		System.out.println("pTable sort test");
		System.out.println("sort test:Weight");
		ptable.Weightsort();
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();
		
		System.out.println("pTable sort test");
		System.out.println("sort test:Period");
		ptable.Periodsort();
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();
		
		System.out.println("pTable sort test");
		System.out.println("sort test:Group");
		ptable.Groupsort();
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();
		
		System.out.println("pTable sort test");
		System.out.println("sort test:Type");
		ptable.Typesort();
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();

		System.out.println("pTable sort test");
		System.out.println("sort test:State");
		ptable.Statesort();
		for(PeriodicElement p:pp)
			System.out.println(p);
		System.out.println();
		
		
		
		
		}

	}
	

