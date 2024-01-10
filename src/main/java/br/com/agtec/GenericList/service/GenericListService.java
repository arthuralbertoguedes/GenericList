package br.com.agtec.GenericList.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

/*
 * Classe que recebe duas listas genéricas e faz a junção removendo registros repetidos.
 */
@Service
public class GenericListService<T> {
	
	
	public List<T> joinLists(List<T> list1, List<T> list2){
		
		list1.addAll(list2);
		list1 = removeRepeteatedValues(list1);
		return list1;
	}
	
	public List<T> removeRepeteatedValues(List<T> list){
		
		Iterator<T> iterator = list.iterator();
		List<T> returnList = new ArrayList<>();
		
		while(iterator.hasNext()) {
			
			T element = iterator.next();
			if(!returnList.contains(element))
				returnList.add(element);

		}
		
		return returnList;
	}


}
