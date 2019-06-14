package esercizioIva.collection.controller;

import esercizioIva.collection.classes.OrdineDiretto;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

import esercizioIva.collection.classes.Prodotto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Collections;



public class Main {	
public static void main(String[] args) {
	
		
	  //Creating a generic ArrayList
		Collection<Prodotto> listino = new ArrayList<Prodotto>();
	  

	  //System.out.println("Lunghezza del listino appena creato: " + listino.size());
	  
	  try {
	  Path r = Paths.get("Products.txt");
	  Collection<String> linee = Files.lines(r).collect(Collectors.toList());
	  
	  
	  for(String l : linee) {
		  String[] parole= l.split(";");
		  //System.out.println(parole.length);
		  Prodotto q = new Prodotto(parole[0],Integer.parseInt(parole[1].substring(0,parole[1].length()-1)));
	
		  listino.add(q);
		  
		  System.out.println(q.getNomeProdotto()+" "+q.getIvaProdotto());
		  
		  
		  
	  }
		
	  System.out.println("Quale prodotto cerchi?");
	  Scanner scanner = new Scanner(System.in);
	  String inputString = scanner.nextLine();
	  
	  System.out.println("Il prodotto che cerchi portebbe essere: ");
	  for(Prodotto p : listino) 
	  {
		  if (p.getNomeProdotto().contains(inputString))
		  {System.out.println(p.getNomeProdotto() + " " +p.getIvaProdotto());}
	  }
	  }
	  catch (IOException e) {}
	}
}
