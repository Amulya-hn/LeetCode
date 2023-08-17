class Solution {
    public boolean wordBreak(String s, List<String> wordDic) {
        int l=s.length();
        int seen[]=new int[l+1];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            int iniInd=q.remove();
            if(iniInd==l)
                return true;
            for(int i=iniInd+1;i<l+1;i++)
            {
                if(seen[i]==1)
                    continue;
                if(wordDic.contains(s.substring(iniInd,i)))
                {
                    seen[i]=1;
                    q.add(i);
                }
            }
        }
        return false;
    }
}