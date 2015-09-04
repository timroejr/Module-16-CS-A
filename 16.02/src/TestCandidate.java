import java.util.*;
public class TestCandidate {
	public static List<Candidate> election = new ArrayList<Candidate>();
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
		election.add(c1);
		election.add(c2);
		election.add(c3);
		election.add(c4);
		election.add(c5);
		election.add(c6);
		election.add(c7);
		election.add(c8);
		election.add(c9);
		election.add(c10);
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
	public static void main(String[] args) {
		addCandidates();
		printVotes();
		printResults();
		replaceName("Michael Duffy", "John Elmos");
		replaceVotes("Mickey Jones", 2500);
		replaceCandidate("Kathleen Turner", "John Kennedy", 8500);
	}
}
