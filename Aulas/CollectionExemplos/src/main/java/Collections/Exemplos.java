package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;

public class Exemplos {

	public static void main(String[] args) {
		List<String> nomesArrayList= new ArrayList<>();
		nomesArrayList.add("Joao");
		nomesArrayList.add("Maria");
		nomesArrayList.add("José");
		nomesArrayList.remove(1);
		//varredura
		for(String s:nomesArrayList) 
			System.out.println("Item:"+s);
		
		
		//varredura com iterator
		Iterator iter=nomesArrayList.iterator();
		while(iter.hasNext())
			System.out.println("Item:"+iter.next());
		
		List<String> nomesLinkedList= new LinkedList();
		nomesLinkedList.add("Joao");
		nomesLinkedList.add("Maria");
		nomesLinkedList.add("José");
		nomesLinkedList.remove("Maria");
		for(String s:nomesLinkedList)
			System.out.println("Item:"+s);
		
		
		Set<String> nomeHashSet=new HashSet();
		nomeHashSet.add("Joao");
		nomeHashSet.add("Maria");
		nomeHashSet.add("Jose");
		for(String s:nomeHashSet) 
			System.out.println("Item:"+s);
		nomeHashSet.remove("Maria");
		
		Set<String> nomesTreeSet= new TreeSet();
		nomesTreeSet.add("Joao");
		nomesTreeSet.add("Maria");
		nomesTreeSet.add("Jose");
		for(String s:nomesTreeSet)
			System.out.println("Item:"+s);
		nomesTreeSet.remove("Maria");
		
		Map<Integer, String> nomesHashMap= new HashMap();
		nomesHashMap.put(1, "Joao");
		nomesHashMap.put(2, "Maria");
		nomesHashMap.put(3, "Jose");
		System.out.println(" "+nomesHashMap.get(1));
		nomesHashMap.remove(1);
		for(Map.Entry<Integer, String> item:nomesHashMap.entrySet())
			System.out.println(item.getKey()+"<->"+item.getValue());
		for(Integer key:nomesHashMap.keySet()) 
			System.out.println(key+"<<->>"+nomesHashMap.get(key));
		Map<Integer, String> mapaux= new HashMap();
		nomesHashMap.forEach((key,value) -> {
			System.out.println(key+" -> "+value);
			if(key>1) {
				mapaux.put(key, value);
			}
		});
		nomesHashMap.keySet().removeAll(mapaux.keySet());
		
		Map<Integer, String> nomesTreeMap= new TreeMap();
		nomesTreeMap.put(1, "Joao");
		nomesTreeMap.put(2, "Maria");
		nomesTreeMap.put(3, "Jose");
		nomesTreeMap.forEach((k,v) -> {
			System.out.println(k+" == "+v);
			System.out.println(nomesTreeMap.get(k));
		});
		
		Set<String> nomesLinkedHashSet = new LinkedHashSet();
		nomesLinkedHashSet.add("Joao");
		nomesLinkedHashSet.add("Maria");
		nomesLinkedHashSet.add("Jose");
		
		Queue<String> nomesQueue=new PriorityQueue(); //Fifo
		nomesQueue.add("Joao");
		nomesQueue.offer("Maria");
		nomesQueue.offer("Jose");
		nomesQueue.forEach((v) -> {
			System.out.println(v);
		});
		nomesQueue.remove();
		nomesQueue.remove("Maria");
		
		//===============
		List<List<String>> listaS= new ArrayList();
		
		Deque<String> deque= new ArrayDeque();
		deque.add("Joao");
		deque.addFirst("Primeiro");
		deque.add("Ultimo");
	}
	
	public static void mostrar(Collection c) {
		System.out.println("Iterador");
		Iterator iter=c.iterator();
		while(iter.hasNext()) {
			System.out.println(""+iter.next());
		}
		
		
	}

}
