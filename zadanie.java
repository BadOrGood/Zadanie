package quanterallzadanie;

public class main {
	private static String[] StringBlob = {
		"University", "Java", "JavaScript", "PHP", "HTML", "CSS", "Spring", "Vue", "Angular", "CSS", "CSS" 
	};
	
	public static void main(String []args) {
		int NumberOfWords;
		int PageNumber;
		int KeywordCount = 0;
		boolean HasKeywords = true;

		if (args.length == 2) {
			HasKeywords = false;
		} else if (args.length > 2) {
			HasKeywords = true;
		} else {
			System.out.println("Няма достатъчно аргументи; брой страници, номера на страница, ключова дума");
			
			return;
		}
		
		try {
			NumberOfWords = Integer.parseUnsignedInt(args[0]);
			PageNumber = Integer.parseUnsignedInt(args[1]);
		} catch (Exception e) {
			System.out.println("Невалиден аргумент");

			return;
		}

		if (HasKeywords) {
			for (int i = 0; i != StringBlob.length; i++) {
				for (int y = 2; y != args.length; y++) {
					if (StringBlob[i].equals(args[y])) {
						KeywordCount++;
					}
				}
			}
			
			if (KeywordCount == 0) {
				System.out.println("Няма резултат");
				
				return;
			}

			System.out.print("Items: ");
			
			for (int y = 2; y != args.length; y++) {
				System.out.print(args[y]);

				if (y != args.length - 1) {
					System.out.print(", ");
				}
			}
			
			System.out.print("; Total Items: " + KeywordCount + ";");
		} else {
			int ProperNumberofWords;

			if (NumberOfWords > StringBlob.length) {
				ProperNumberofWords = StringBlob.length;	
			} else {
				ProperNumberofWords = NumberOfWords;
			}
			
			System.out.print("Items: ");
			
			for (int i = 0; i != ProperNumberofWords; i++) {
				System.out.print(StringBlob[i]);
				
				if (i != ProperNumberofWords - 1) {
					System.out.print(", ");
				}
			}
			
			System.out.print("; Total Items: " + StringBlob.length + ";");
		}
	}
}
