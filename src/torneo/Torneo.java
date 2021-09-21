package torneo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class Torneo {
	
	private Map<Integer, PriorityQueue<Integer>> participantes;
	private TreeMap <Integer, LinkedList<Integer>> podio;
	
	public Torneo(String archivo) throws FileNotFoundException {
		setParticipantes(archivo);
		setPodio();
	}
	
	private void setParticipantes(String archivo) throws FileNotFoundException{
		participantes = new TreeMap<Integer, PriorityQueue<Integer>>();
		Scanner sc = new Scanner (new File (archivo));
		
	}
	

}
