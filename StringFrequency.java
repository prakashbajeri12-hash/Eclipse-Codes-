import java.util.Scanner;

public class StringFrequency 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

       	 	System.out.print("Enter a sentence: ");
        	String sentence = sc.nextLine();

        	sentence = sentence.trim();

        	int words = 0;
       	 	int alphabets = 0;
        	int vowels = 0;
        	int consonants = 0;
        	int digits = 0;
        	int spaces = 0;
        	int specialCharacters = 0;

		int aCnt = 0;
        	int eCnt = 0;
        	int iCnt = 0;
        	int oCnt = 0;
        	int uCnt = 0;

       		
        	int[] alphabetFrequency = new int[26];

        	
        	for (int i = 0; i < sentence.length(); i++) 
		{
			char ch = sentence.charAt(i);

            		if (Character.isLetter(ch)) 
			{
				alphabets++;
				char lower = Character.toLowerCase(ch);

           			alphabetFrequency[lower - 'a']++;

                	
                		switch (lower) 
				{
                   			 case 'a':
                        		     vowels++;
                        	             aCnt++;
                        		     break;

                    			 case 'e':
                       			     vowels++;
                        		     eCnt++;
                  		             break;

                    			 case 'i':
                        		     vowels++;
                                             iCnt++;
                                             break;

                    			 case 'o':
					     vowels++;
                       			     oCnt++;
                        		     break;


                    			 case 'u':
                        		      vowels++;
                        		      uCnt++;
                       			      break;

                    			 default:
                        		      consonants++;
                		}

            		} 
			else if (Character.isDigit(ch)) 
			{
                		digits++;

            		} 
	    		else if (ch == ' ') 
			{
                		spaces++;

            		} 
			else 
			{
                		specialCharacters++;
            		}
        	}

       
        	if (!sentence.isEmpty()) 
		{
            		String[] wordArray = sentence.split("\\s+");
            		words = wordArray.length;
        	}

        	
        	int maxFrequency = 0;
        	char mostFrequentAlphabet = '-';

        	for (int i = 0; i < 26; i++) 
		{
            		if (alphabetFrequency[i] > maxFrequency) 
			{
                		maxFrequency = alphabetFrequency[i];
                		mostFrequentAlphabet = (char) ('a' + i);
            		}
        	}

        	// Display results
        	System.out.println("\n========== STRING FREQUENCY REPORT ==========");
       		System.out.println("Trimmed Sentence       : " + sentence);
        	System.out.println("---------------------------------------------");

        	System.out.println("Total Words            : " + words);
        	System.out.println("Total Alphabets        : " + alphabets);
        	System.out.println("Total Vowels           : " + vowels);
        	System.out.println("Total Consonants       : " + consonants);
        	System.out.println("Total Digits           : " + digits);
        	System.out.println("Total Spaces           : " + spaces);
        	System.out.println("Special Characters     : " + specialCharacters);

        	System.out.println("\nVowel Frequency:");
        	System.out.println("A : " + aCnt);
        	System.out.println("E : " + eCnt);
        	System.out.println("I : " + iCnt);
        	System.out.println("O : " + oCnt);
        	System.out.println("U : " + uCnt);

        	if (maxFrequency > 0) 
		{
            		System.out.println("\nMost Frequent Alphabet : "+ Character.toUpperCase(mostFrequentAlphabet) + " (" + maxFrequency + " times)");
        	} 
		else 
		{
            		System.out.println("\nMost Frequent Alphabet : No alphabets found");
        	}

        	
        	StringBuilder modifiedSentence = new StringBuilder();

        	for (int i = 0; i < sentence.length(); i++) 
		{

            		char ch = sentence.charAt(i);

            		switch (Character.toLowerCase(ch)) 
			{
                		case 'a':
                		case 'e':
                		case 'i':
                		case 'o':
                		case 'u':
                    		    modifiedSentence.append(Character.toUpperCase(ch));
                    		break;

                		default:
                    		    modifiedSentence.append(ch);
            		}
        	}	

        		System.out.println("\nModified Sentence:");
        		System.out.println(modifiedSentence);

        		System.out.println("=============================================");

        		sc.close();
    	}
}
