package datastructure;

import databases.ConnectToSqlDB;
import databases.ConnectToMongoDB;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class UseArrayList {

	public static void main(String[] args) throws Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<Object> arrayList = new ArrayList<>();
		arrayList.add("Versace");
		arrayList.add(1, "Gucci");
		arrayList.add("Luis Vitton");
		arrayList.add("Calvin Klein");



		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(arrayList.size()-1));
		arrayList.remove("Gucci");


		System.out.println();

		for(Object s: arrayList){
			System.out.println(s);
		}

		System.out.println();

		Iterator it = arrayList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}


		ConnectToSqlDB connectDB = new ConnectToSqlDB();

		connectDB.insertDataFromArrayListToSqlTable(arrayList,"Brands", "Price");

		connectDB.readDataBase("Brands", "Price");

	}

}
