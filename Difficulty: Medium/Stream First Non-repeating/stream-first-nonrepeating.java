class Solution {
    public String FirstNonRepeating(String s) {
        // code here
        String s1="";
        Queue <Character> q=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        int f[]=new int[26];
        for(char c:s.toCharArray()){
            f[c-'a']++;
            q.add(c);
        while(!q.isEmpty() && f[q.peek()-'a']>1){
            q.poll();
        }
        if(q.isEmpty()){
            res.append('#');
        }
        else{
            res.append(q.peek());
        }
        }
        return res.toString();
    }
}