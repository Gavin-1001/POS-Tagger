import java.util.ArrayList;
import java.util.StringTokenizer;

public class PrintBracket {
		public void print(String input){
			//Tagged output from the MaxentTagger is tokenized
			StringTokenizer taggedTokens = new StringTokenizer(input);
			
			//Lists for the tags and words seperated
			ArrayList<String> posTags = new ArrayList<String>();
			ArrayList<String> words = new ArrayList<String>();
			//arraylist for the binaryTree
			ArrayList<String> binaryTree = new ArrayList<String>();
			
			
	
			while(taggedTokens.hasMoreTokens()){
				String t = taggedTokens.nextToken();
				String s = t;
				t= t.replaceAll("[a-z]+_", "");
				s =s.replaceAll("_[A-Z]+", "");
				posTags.add(t);
				words.add(s);
			}//close while
			

			if(posTags.size() < 2){
			//	Parser.output.setText("S [ " + posTags.get(0) + " " + words.get(0) + " ] ");
				System.out.println("S [ " + posTags.get(0) + " " + words.get(0) + " ] ");
			}
			else if(posTags.size() == 2){
				//Parser.output.setText("S [ NP [ " + posTags.get(0) + " " + words.get(0) + " ] " + posTags.get(1) + " " + words.get(1) + " ] ] ");
				System.out.println("S [ NP [ " + posTags.get(0) + " " + words.get(0) + " ] " + posTags.get(1) + " " + words.get(1) + " ] ] ");
			}
			else{
				String out = "S [ NP [ " + posTags.get(0) + " " + words.get(0) + " ] " + posTags.get(1) + " " + words.get(1) + " ] VP  ";
				for(int i = 2; i < posTags.size(); i++){
						out += "[ " + posTags.get(i) + " " +  words.get(i) + " ] ]";
				}
				Parser.output.setText(out + " ] ");
				System.out.println(Parser.output);
				
			}//close else
		}//clsoe

}
