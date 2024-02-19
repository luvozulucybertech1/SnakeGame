public class Program{
	
	
	static String[] Obstacles = new String[30];
	static int numObstacles = 0;
	
	static public void getObstacles(String obstOne) {
		String[] Obs = obstOne.split(" ");
		
		for(int index = 0 ; index < Obs.length; index++) {
			Obstacles[numObstacles] = Obs[index]; 
		}
		return;
	}
	
	
    static public void drawSnake(String Input){
        String out = Input;
        String[] exit = out.split(" ");

        for(int index = 0 ; index < exit.length-1 ; index++){
            drawLine(exit[index],exit[index+1],exit.length*2);
        }

       
    }
    
    static public Boolean Absent(String cord) {
    	for(int index = 0 ;index < Obstacles.length ; index++) {
    		if(Obstacles[index] == cord) {
    			return true;
    		}
    	}
    	return false;
    }

    static public void Vertical(int startx,int finishx , int endy){
    	String Cords = "";
    	for(int index = startx; index < finishx+1;index++){
    		Cords = "" + index + ","+ endy;
    		
    		if(Absent(Cords) == true) {
    			
    		}else {
    			
    		}
        }
        
    }
    
    static public void Horizontal(int startx,int starty , int endy){
        
        int Snake = 0;//SnakeIdentity;
        for(int index = starty; index < endy+1;index++){
   
            //Map[startx][index] = Snake;
        }
    }

    static public void drawLine(String PointOne,String PointtTwo,int length){

        int[] Store = new int[length];
        String[] exit = new String[2];
        exit[0] = PointOne;
        exit[1] = PointtTwo;
        String[] entry = new String[2];
        int counterStore = 0;

        for(int index = 0 ; index < exit.length; index++){

            entry = exit[index].split(",");

            for(String one:entry){
                Store[counterStore] = Integer.parseInt(one);
                counterStore++;
            }
        }

        for(int index = 0 ; index < (Store.length*0.5)-1; index+=2){
            Fill(Store[index],Store[index+1],Store[index+2],Store[index+3]);
        }

    }

    static public void Fill(int StartingPointx,int StartingPointy,int Finishingx,int FinishingPointy){

        int startx = Math.min(StartingPointx,Finishingx);
        int starty = Math.min(StartingPointy,FinishingPointy);
        int finishx = Math.max(StartingPointx,Finishingx); 
        int finishy = Math.max(StartingPointy,FinishingPointy);

        if(startx == finishx){
            Horizontal(startx,starty,finishy);
        }else if(starty == finishy){
            Vertical(startx,finishx,starty);
        }

    }
}