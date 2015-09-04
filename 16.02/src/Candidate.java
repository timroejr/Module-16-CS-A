
public class Candidate {
	public String name;
	public int numVotes;
	Candidate(String n, int nV) {
		name = n;
		numVotes = nV;
	}
	public String getName() {
		return name;
	}
	public int getVotes() {
		return numVotes;
	}
	public String toString() {
		String data = name + ": " + numVotes + " votes";
		return data;
	}
	public void setName(String n) {
		name = n;
	}
	public void setVotes(int v) {
		numVotes = v;
	}
	
}
