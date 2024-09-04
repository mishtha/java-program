public class Trie {
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
        children = new Node[26]; //a-z
            //intiliaze array of children
        for(int i=0; i<26; i++){
            children[i] = null;
        }
          eow = false;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){ //O(L)
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                //add new node
                curr.children[idx] = new Node();
            }
            //eow conddition
            if(i == word.length() -1){
                curr.children[idx].eow = true;
            }
           curr = curr.children[idx];
        }
    }
    // Seach of string(word) in trie
    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){ //O(L); L->keylength
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if(node == null){
                return false;
            }
            if(i == key.length()-1 && node.eow == false){
                return false;
            }
            //update root
            curr = curr.children[idx];
        }
        return true;
    }
    //Que1 word break problem -->recursive way
    // public static boolean wordBreak(String key){
    //     //base case
    //     if(key.length() == 0){
    //         return true;
    //     }
    //     //tukde
    //     for(int i=1; i<=key.length(); i++){
    //      String firstPart = key.substring(0, i);
    //      String seconPart = key.substring(i);
    //      if(search(firstPart) && wordBreak(seconPart)){
    //         return true;
    //      }
    //     }
    //     return false;
    // }

    //Que2. start with priblem finding prifix
        //    public static boolean startsWith(String prefix){
        //    Node curr = root;
        //    for(int i=0; i<prefix.length(); i++){
        //     int idx = prefix.charAt(i) - 'a';
        //     if(curr.children[idx] == null){
        //         return false;
        //     }
        //     curr = curr.children[idx];  //update level
        //    }
        //    return true;
        //    }

    

    //Que3. Count unique Substrings
    //step 3
    // public static int countNode(Node root){
    //     //base case
    // if(root == null){
    //     return 0;
    // }
    // int count = 0;
    // for(int i=0; i<26; i++){
    //     if(root.children[i] != null){
    //         count+= countNode(root.children[i]);
    //     }

    // }
    // return count+1;
    // }


    // Que4. longest word with all prefixes
    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
     //base case
     if(root == null){
        return;
     }
     //step 1
     for(int i=0; i<26; i++){
        if(root.children[i] != null && root.children[i].eow == true){
            temp.append((char)(i+'a'));
            //compare with final answer step 2
            if(temp.length()> ans.length()){
              ans = temp.toString();
            }
            //step 3 recusrsive call
            longestWord(root.children[i], temp);
            //backtrack --> taki kabhi agli call jaye to usme naya character insert ho sake
            temp.deleteCharAt(temp.length()-1);
        }
     }
    }

     
     public static void main(String args[]){
        //String words[] = {"i", "like", "sam", "samsung", "mobile"};
        //String key = "ilikesamsung";        // for(int i=0; i<words.length; i++){
        //     insert(words[i]);
        // }
        // System.out.println(search("their"));
        // System.out.println(search("thor"));
        // System.out.println(search("an"));
        //que1. build a trie
        //  for(int i=0; i<words.length; i++){
        //     insert(words[i]);
        //  }
        // System.out.println(wordBreak(key));

        //Que2 
        // String words[] = {"apple", "app", "mango", "man", "women"};
        // //String prefix = "app";
        // String prefix = "moon";
        // //String prefix = "man";
        // for(int i=0; i<words.length; i++){
        //      insert(words[i]);
        //  }
        //  System.out.println(startsWith(prefix));

        //Que3
        // String str = "ababa";
        // //steep 1 find all possible suffix
        // for(int i=0; i<str.length(); i++){
        //     String suffix = str.substring(i);
        //     // System.out.println(suffix);
        // //step2 create trie by all suffix
        //   insert(suffix);
        // }
        // System.out.println(countNode(root));

    //Que4.
    String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
    for(int i=0; i<words.length; i++){
        insert(words[i]);
    }
    longestWord(root, new StringBuilder(""));
    System.out.println(ans);
     }
}
