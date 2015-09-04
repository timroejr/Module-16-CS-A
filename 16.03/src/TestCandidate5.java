import java.util.ArrayList;
import java.util.List;
public class TestCandidate5 {
	//public static List<Candidate> election = new ArrayList<Candidate>();
	public static Candidate[] election;
	public static void addCandidates() {
		Candidate c1 = new Candidate("Mickey Jones", 3000);
		Candidate c2 = new Candidate("Rebecca Morgan", 2000);
		Candidate c3 = new Candidate("Kathleen Turner", 8000);
		Candidate c4 = new Candidate("Tory Parker", 500);
		Candidate c5 = new Candidate("Ashton Davis", 10000);
		Candidate c6 = new Candidate("John Smith", 5000);
		Candidate c7 = new Candidate("Mary Miller", 4000);
		Candidate c8 = new Candidate("Michael Duffy", 6000);
		Candidate c9 = new Candidate("Tim Robinson", 2500);
		Candidate c10 = new Candidate("Joe Ashtony", 1800);
		Candidate[] candidates = new Candidate[] {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
		election = candidates;
	}
	public static void printVotes() {
		for (Candidate c : election) {
			System.out.println(c.toString());
		}
		System.out.println();
	}
	public static int getTotal() {
		int votes = 0;
		for (Candidate c : election) {
			votes = votes + c.getVotes();
		}
		return votes;
	}
	public static void printResults() {
		int totalVotes = getTotal();
		System.out.println();
		System.out.println("Election Results");
		System.out.println("Candidate\t |\t Votes\t |\t Percent of Vote");
		for (Candidate c : election) {
			int votes = c.getVotes();
			//System.out.println(votes);
			int percent = (votes * 100/totalVotes);
			//System.out.println(percent);
			System.out.println(c.getName() + "\t |\t " + c.getVotes() + "\t |\t " + percent + "%");
		}
	}
	public static void replaceName(String candidateName, String replacementName) {
		for (Candidate c : election) {
			if (candidateName.equals(c.getName())) {
				c.setName(replacementName);
			}
		}
		printResults();
	}
	public static void replaceVotes(String candidateName, int votes) {
		for (Candidate c : election) {
			if (candidateName.equals(c.getName())) {
				c.setVotes(votes);
			}
		}
		printResults();
	}
	public static void replaceCandidate(String candidateName, String replacementName, int votes) {
		for (Candidate c : election) {
			if (candidateName.equals(c.getName())) {
				c.setName(replacementName);
				c.setVotes(votes);
			}
		}
		printResults();
	}
	/**
	 * 
	 * @param candidateToAdd Candidate that will be added to the Array
	 * @param candidateAfter Candidate that comes directly after the one you are adding
	 */
	public static void insertName(String candidateToAdd, String candidateAfter, int votesForCandidate) {
		int index = 0;
		int location = 0;
		for (Candidate c : election) {
			if (candidateAfter.equals(c.getName())) {
				location = index;
			}
			index++;
		}
		for (int i = election.length - 1; i > location; i--) {
			election[i] = election[i - 1];
		}
		Candidate can = new Candidate(candidateToAdd, votesForCandidate);
		election[location] = can;
		printResults();
	}
	
	public static void insertPos(String newCandidate, int votes, int pos) {
		int index = 0;
		int location = pos;
		for (int i = election.length - 1; i > location; i--) {
			election[i] = election [i-1];
		}
		Candidate newCan = new Candidate(newCandidate, votes);
		election[location] = newCan;
		printResults();
	}
	
	public static void main(String[] args) {
		addCandidates();
		printVotes();
		printResults();
		replaceName("Michael Duffy", "John Elmos");
		replaceVotes("Mickey Jones", 2500);
		replaceCandidate("Kathleen Turner", "John Kennedy", 8500);
		insertPos("Mickey Duck", 14000, 5);
		insertName("Donald Mouse", "Kathleen Turner", 100);
		
	}
}
