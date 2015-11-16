package g52ads;

public interface Graph_interf {
	public void addEdge(int source , int destination);
	
	public void  deleteEdge(int source ,int destination);
	
    public int getNumberOfVertices();
   
    public int getNumberOfEdges();
     
    public boolean existsEdge(int source, int destination);
    
    
}
