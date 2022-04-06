package Tries;



class node{
    node link[] = new node[26];
    boolean flag = false;
    void put(char c ,node n){
        link[c-'a']= n;
    }
    boolean conkey(char c){
        return link[c-'a']!=null;

    }
    node get(char c)
    {
        return link[c-'a'];
    }
    void setEnd(){
        flag = true;

    }
    boolean isEnd(){
        return flag;
    }
}
class Trie {
    node root;


    public Trie() {
        root = new node();
    }

    public void insert(String word) {
        node n = root;
        for(int i=0;i<word.length();i++){
            if(!n.conkey(word.charAt(i)))
                n.put(word.charAt(i),new node());
            n = n.get(word.charAt(i));


        }
        n.setEnd();
    }

    public boolean search(String word) {
        node n = root;
        for(int i=0;i<word.length();i++){
            if(!n.conkey(word.charAt(i)))
                return false;
            n = n.get(word.charAt(i));


        }
        return n.isEnd();

    }

    public boolean startsWith(String prefix) {
        node n = root;
        for(int i=0;i<prefix.length();i++){
            if(!n.conkey(prefix.charAt(i)))
                return false;
            n = n.get(prefix.charAt(i));



        }
        return true;


    }


}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */