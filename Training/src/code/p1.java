package code;



class p1 {
	
	
	public static void main(String[] args) {
		String haystack="butsad";
		String needlelength="sad";
		
		int result=strStr(haystack,needlelength);
		System.out.println(result);
	}

	
	
    public static int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}