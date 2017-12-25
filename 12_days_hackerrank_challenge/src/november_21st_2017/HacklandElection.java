package november_21st_2017;

public class HacklandElection {

	public static void sort(String[] str) {
		boolean done = false;
		while (done == false) {
			done = true;
			for (int i = 0; i < str.length - 1; i++) {
				int num = 0;
				if (str[i] != null && str[i + 1] != null) {
					String name1 = str[i];
					String name2 = str[i + 1];
					num = name1.compareTo(name2);
				} else if (str[i] == null && str[i + 1] == null) {
					num = 0;
				} else if (str[i] == null) {
					num = 1;
				} else {
					num = -1;
				}
				if (num > 0) {
					String temp = str[i];
					str[i] = str[i + 1];
					str[i + 1] = temp;
					done = false;
				}
			}
		}
	}

	static String electionWinner(String[] votes) {
		
		String name = votes[0];
        int count = 0;
        for(int j = 0; j < votes.length-1; j++) {
            if(name.equals(votes[j])) {
                count++;
            }
        }
        if(votes.length-1 == count) {
        	System.out.println("worked");
            return name;
        }
		
		
		sort(votes);

		int countMax = 0;
		int prevMax = -1;
		String reqNam = "";
		
		for (int j = 0; j < votes.length-1; j++) {
			for (int i = j + 1; i < votes.length; i++) {
				if (votes[i].equals(votes[j])) {
					countMax++;
				}
			}
			if(countMax >= prevMax) {
				reqNam = votes[j];
				prevMax = countMax;
			}
		}

		return reqNam;
	}

	public static void main(String[] args) {
		/*String[] votest = { "Alex", "Michael", "Harry", "Dave", "Michael",
				"Victor", "Harry", "Alex", "Mary", "Mary" };*/
		String[] votes = {"Alex", "Alex", "Alex" };
		String winner = electionWinner(votes);
		System.out.println(winner);

	}
}
