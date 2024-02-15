import java.util.Queue;
import java.util.LinkedList;

public class BFS {
	
	Queue<Integer> CurrentNode = new LinkedList<>();
	Queue<Integer> Visited = new LinkedList<>();
	Queue<Integer> NextNode = new LinkedList<>();
	Queue<Integer> ChildrenNode = new LinkedList<>();
	Queue<Integer> ParentNode = new LinkedList<>();
	LinkedList<Integer> Cost = new LinkedList<>();
	
	static public Boolean isVisited() {
		return true;
	}
	
	static public Integer CalculateCost() {
		return 1;
	}
	static public Integer GetCost() {
		return 1;
	}
	static public Integer route(Integer Headx, Integer heady,Integer applex,Integer appley) {
		return 1;
	}
	

}
