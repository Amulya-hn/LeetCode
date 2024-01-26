class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=s.length()-1;
        int j=0;
        if("".equals(s))
            return true;
        for(int i=0;i<t.length();i++)
        {
            if(s.charAt(j)==t.charAt(i))
            {
                if(j==l)
                {
                    return true;
                }
                ++j;
            }
        }
        return false;
    }
}
