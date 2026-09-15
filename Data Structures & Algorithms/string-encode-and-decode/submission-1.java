class Solution {

    public String encode(List<String> strs) {
        String str = "";
        String lengths = "";
        for(String s: strs){
            int temp = s.length();
            lengths = lengths.concat(Integer.toString(temp)) + "_";
            str = str+s;
        }
        String encoded = lengths+' '+str;
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if(str=="") return result;
        int start = str.indexOf(' ')+1;
        String s = str.substring(start);
        String lengths = str.substring(0,start);
        int length = 0;
        int index = 0;
        for(int i=0;i<lengths.length();i++){
            char ch = lengths.charAt(i);
            if(ch=='_'){
                result.add(s.substring(index,index+length));
                index+=length;
                length = 0;
            }else{
                length = length*10 + (ch-'0');
            }
        }
        return result;
    }
}
